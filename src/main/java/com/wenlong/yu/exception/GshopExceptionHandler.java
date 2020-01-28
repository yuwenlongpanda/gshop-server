package com.wenlong.yu.exception;

import com.wenlong.yu.pojo.Result;
import com.wenlong.yu.utils.ResultBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ControllerAdvice
public class GshopExceptionHandler {

    @ExceptionHandler(GshopException.class)
    @ResponseBody
    public Result exceptionHandler(GshopException e){
        log.error("错误消息：{}", e.getMessage(), e);
       return ResultBuilder.buildNgResult(e.getMsg());
    }
}
