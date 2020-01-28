package com.wenlong.yu.utils;

import com.wenlong.yu.pojo.Result;

public class ResultBuilder {

  public static Result buildOkResult() {
    return new Result(0, null);
  }

  public static Result buildNgResult() {
    return new Result(1, null);
  }

  public static Result buildOkResult(Object data) {
    return new Result(0, data);
  }

  public static Result buildNgResult(Object data) {
    return new Result(1, data);
  }

}
