package com.example.backend.exception;

import com.example.backend.utils.RestBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.HttpClientErrorException;

/**
 * @author 湛蓝之翼
 * @version 1.0
 * @description 统一异常处理类
 * @date 2023/10/3 15:20
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(BadRequestException.class)
    @ResponseBody
    public RestBean error(BadRequestException e){
        e.printStackTrace();
        log.error(ThrowableUtil.getStackTrace(e));
        return RestBean.fail(e.getMessage(),e.getStatus());
    }
}
