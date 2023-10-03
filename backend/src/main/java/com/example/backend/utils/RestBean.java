package com.example.backend.utils;

import lombok.Data;

/**
 * @author 湛蓝之翼
 * @version 1.0
 * @description: 统一结果封装类
 * @date 2023/10/3 12:55
 */
@Data
public class RestBean {
    public static final int STATUS_SUCCESS = 200;
    public static final int STATUS_FALL = 500;

    /**
     * 返回状态码
     */
    private int status;

    /**
     * 返回消息
     */
    private String message;

    /**
     * 返回数据
     */
    private Object result;

    /**
     * 返回时间
     */
    private long timestamp = System.currentTimeMillis();

    /**
     * 创建返回对象
     *
     * @param status 返回状态
     * @param message 返回消息
     * @param result  返回数据
     * @return
     */
    private static RestBean createResult(int status, String message, Object result) {
        RestBean RestBean = new RestBean();
        RestBean.setStatus(status);
        RestBean.setMessage(message);
        RestBean.setResult(result);
        return RestBean;
    }

    /**
     * 默认返回成功方法
     *
     * @return
     */
    public static RestBean success() {
        return RestBean.createResult(STATUS_SUCCESS, "成功", null);
    }

    /**
     * 返回成功带消息
     *
     * @param message 返回消息
     * @return
     */
    public static RestBean success(String message) {
        return RestBean.createResult(STATUS_SUCCESS, message, null);
    }

    /**
     * 返回成功带数据
     *
     * @param result 返回数据
     * @return
     */
    public static RestBean success(Object result) {
        return RestBean.createResult(STATUS_SUCCESS, "成功", result);
    }

    /**
     * 返回成功带消息和数据
     *
     * @param message 返回消息
     * @param result 返回数据
     * @return
     */
    public static RestBean success(String message, Object result) {
        return RestBean.createResult(STATUS_SUCCESS, message, result);
    }

    /**
     * 默认返回失败方法
     *
     * @return
     */
    public static RestBean fail() {
        return RestBean.createResult(STATUS_FALL, "失败", null);
    }

    /**
     * 返回失败带消息
     *
     * @param message 返回消息
     * @return
     */
    public static RestBean fail(String message) {
        return RestBean.createResult(STATUS_FALL, message, null);
    }

    /**
     * 返回失败带消息和数据
     *
     * @param message 返回消息
     * @param result 返回数据
     * @return
     */
    public static RestBean fail(String message, Object result) {
        return RestBean.createResult(STATUS_FALL, message, result);
    }
}
