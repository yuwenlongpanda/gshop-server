package com.wenlong.yu.controller;

import com.wenlong.yu.pojo.Result;
import com.wenlong.yu.service.UserService;
import com.wenlong.yu.utils.ResultBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class UserController {

  @Autowired
  UserService userService;

  @RequestMapping("login_pwd")
  @ResponseBody
  public Result loginPwd(@RequestBody Map<String, String> map) {
    return ResultBuilder.buildOkResult(userService.loginPwd(map.get("name"), map.get("pwd"),
        map.get("captcha")));
  }

  @RequestMapping("login_sms")
  @ResponseBody
  public Result loginSms(@RequestBody Map<String, String> map) {
    return ResultBuilder.buildOkResult(userService.loginSms(map.get("phone"),
        map.get("code")));
  }

}
