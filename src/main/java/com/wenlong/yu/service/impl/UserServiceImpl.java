package com.wenlong.yu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wenlong.yu.exception.GshopException;
import com.wenlong.yu.mapper.UserMapper;
import com.wenlong.yu.pojo.User;
import com.wenlong.yu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserMapper userMapper;

  @Override
  public User getUserinfo(int userId) {
    return userMapper.selectById(userId);
  }

  @Override
  public User loginPwd(String name, String pwd, String captcha) {
    QueryWrapper<User> queryWrapper = new QueryWrapper<>();
    queryWrapper.eq("name", name).eq("pwd", pwd);
    User newUser = userMapper.selectOne(queryWrapper);
    if (newUser == null) {
      throw new GshopException("用户名或密码不正确");
    }
    return newUser;
  }

  @Override
  public User loginSms(String phone, String code) {
    if (!"123456".equals(code)) {
      throw new GshopException("验证码不正确");
    }
    QueryWrapper<User> queryWrapper = new QueryWrapper<>();
    queryWrapper.eq("phone", phone);
    return userMapper.selectOne(queryWrapper);
  }

}
