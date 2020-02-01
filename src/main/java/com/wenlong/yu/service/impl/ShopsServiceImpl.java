package com.wenlong.yu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wenlong.yu.mapper.ShopsMapper;
import com.wenlong.yu.pojo.Shops;
import com.wenlong.yu.service.ShopsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopsServiceImpl implements ShopsService {

  @Autowired
  ShopsMapper shopsMapper;

  @Override
  public List<Shops> getShopsList() {
    return shopsMapper.selectList(null);
  }

  @Override
  public List<Shops> searchShops(String keyword) {
    QueryWrapper<Shops> queryWrapper = new QueryWrapper<>();
    queryWrapper.like("name", keyword);
    return shopsMapper.selectList(queryWrapper);
  }

}
