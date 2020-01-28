package com.wenlong.yu.exception;

import lombok.Data;

@Data
public class GshopException extends RuntimeException {

  private String msg;

  public GshopException() {

  }

  public GshopException(String msg){
    super(msg);
    this.msg = msg;
  }
}
