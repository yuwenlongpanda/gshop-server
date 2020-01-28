package com.wenlong.yu.exception;

import com.wenlong.yu.pojo.Result;
import com.wenlong.yu.utils.ResultBuilder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GshopExceptionHandler {

    @ExceptionHandler(GshopException.class)
    @ResponseBody
    public Result exceptionHandler(GshopException e){
       return ResultBuilder.buildNgResult(e.getMsg());
    }
}
