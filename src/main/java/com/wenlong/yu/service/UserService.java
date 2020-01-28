package com.wenlong.yu.service;

import com.wenlong.yu.pojo.User;

public interface UserService {

  User getUserinfo(int userId);

  User loginPwd(String name, String pwd, String captcha);

  User loginSms(String phone, String code);
}
