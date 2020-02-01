package com.wenlong.yu.service;

import com.wenlong.yu.pojo.Shops;

import java.util.List;

public interface ShopsService {

  List<Shops> getShopsList();


  List<Shops> searchShops(String keyword);
}
