package com.wenlong.yu.controller;

import com.wenlong.yu.pojo.Result;
import com.wenlong.yu.service.ShopsService;
import com.wenlong.yu.utils.ResultBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ShopsController {

  @Autowired
  ShopsService shopsService;

  @RequestMapping("shops")
  @ResponseBody
  public Result getShopsList() {
    return ResultBuilder.buildOkResult(shopsService.getShopsList());
  }

  @RequestMapping("search_shops")
  @ResponseBody
  public Result searchShops(@RequestParam String keyword) {
    return ResultBuilder.buildOkResult(shopsService.searchShops(keyword));
  }

}
