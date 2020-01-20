package com.wenlong.yu.service.impl;

import com.wenlong.yu.mapper.IndexCategoryMapper;
import com.wenlong.yu.pojo.IndexCategory;
import com.wenlong.yu.service.IndexCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexCategoryServiceImpl implements IndexCategoryService {

  @Autowired
  IndexCategoryMapper indexCategoryMapper;

  @Override
  public List<IndexCategory> getIndexCategoryList() {
    return indexCategoryMapper.selectList(null);
  }

}
