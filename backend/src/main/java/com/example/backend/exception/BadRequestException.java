package com.example.backend.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

/**
 * @author 湛蓝之翼
 * @version 1.0
 * @description 异常处理实体类
 * @date 2023/10/3 15:29
 */
@Getter
public class BadRequestException extends RuntimeException{
    private Integer status =  BAD_REQUEST.value();
    public BadRequestException(String msg){
        super(msg);
    }
    public BadRequestException(HttpStatus status,String msg){
        super(msg);
        this.status = status.value();
    }
}
