package com.wenlong.yu.utils;

import com.wenlong.yu.pojo.Result;

import java.util.List;

public class ResultBuilder {

  public static Result buildOkResult(List data) {
    return new Result(0, data);
  }

  public static Result buildNgResult(List data) {
    return new Result(1, data);
  }

}
