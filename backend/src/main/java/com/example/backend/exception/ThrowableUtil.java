package com.example.backend.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author 湛蓝之翼
 * @version 1.0
 * @description 异常抛出类
 * @date 2023/10/3 15:34
 */
public class ThrowableUtil {
    /**
     * 获取堆栈信息
     * @param throwable
     * @return
     */
    public static String getStackTrace(Throwable throwable){
        StringWriter stringWriter = new StringWriter();
        try(PrintWriter printWriter = new PrintWriter(stringWriter)) {
            throwable.printStackTrace();
            return stringWriter.toString();
        }
    }
}
