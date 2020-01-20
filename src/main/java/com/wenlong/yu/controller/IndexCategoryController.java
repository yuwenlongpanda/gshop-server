package com.wenlong.yu.controller;

import com.wenlong.yu.pojo.Result;
import com.wenlong.yu.service.IndexCategoryService;
import com.wenlong.yu.utils.ResultBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexCategoryController {

  @Autowired
  IndexCategoryService indexCategoryService;

  @RequestMapping("index_category")
  @ResponseBody
  public Result getIndexCategoryList() {
    return ResultBuilder.buildOkResult(indexCategoryService.getIndexCategoryList());
  }

}
