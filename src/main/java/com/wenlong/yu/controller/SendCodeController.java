package com.wenlong.yu.controller;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.wenlong.yu.pojo.Result;
import com.wenlong.yu.utils.ResultBuilder;
import com.wenlong.yu.utils.SmsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SendCodeController {

  @Autowired
  private SmsUtils smsUtils;

  @RequestMapping("sendcode")
  @ResponseBody
  public Result sendCode(@RequestParam String phone) throws ClientException {
    SendSmsResponse sendSmsResponse = this.smsUtils.sendSms(phone, "123456");
    if ("OK".equalsIgnoreCase(sendSmsResponse.getCode())) {
      return  ResultBuilder.buildOkResult();
    }
    return ResultBuilder.buildNgResult(sendSmsResponse.getMessage());
  }
}
