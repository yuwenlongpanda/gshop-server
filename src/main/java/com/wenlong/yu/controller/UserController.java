package com.wenlong.yu.controller;

import com.wenlong.yu.pojo.Result;
import com.wenlong.yu.pojo.User;
import com.wenlong.yu.service.UserService;
import com.wenlong.yu.utils.CookieUtils;
import com.wenlong.yu.utils.ResultBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class UserController {

  @Autowired
  UserService userService;

  @RequestMapping("login_pwd")
  @ResponseBody
  public Result loginPwd(@RequestBody Map<String, String> map, HttpServletResponse response) {
    User result = userService.loginPwd(map.get("name"), map.get("pwd"),
        map.get("captcha"));
    CookieUtils.writeCookie(response, CookieUtils.USER_ID, String.valueOf(result.getId()));
    return ResultBuilder.buildOkResult(result);
  }

  @RequestMapping("login_sms")
  @ResponseBody
  public Result loginSms(@RequestBody Map<String, String> map, HttpServletResponse response) {
    User result = userService.loginSms(map.get("phone"),
        map.get("code"));
    CookieUtils.writeCookie(response, CookieUtils.USER_ID, String.valueOf(result.getId()));
    return ResultBuilder.buildOkResult(result);
  }

  @RequestMapping("userinfo")
  @ResponseBody
  public Result getUserinfo(HttpServletRequest request) {
    int userId = Integer.valueOf(CookieUtils.getCookie(request, CookieUtils.USER_ID));
    return ResultBuilder.buildOkResult(userService.getUserinfo(userId));
  }

}
