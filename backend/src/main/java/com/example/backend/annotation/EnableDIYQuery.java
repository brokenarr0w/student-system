package com.example.backend.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 湛蓝之翼
 * @version 1.0
 * @description 自定义注解（用于查询）
 * @date 2023/10/3 15:20
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnableDIYQuery {
    //基本对象的属性名
    String propName() default "";
    //查询类型
    Type type() default Type.EQUAL;

    // 连接查询的属性名，如User类中的dept
    String joinName() default "";
    Join join() default Join.LEFT;
    //多字段模糊查询，仅支持String字段
    String blurry() default "";

    enum Type{
        //相等
        EQUAL,
        //大于等于
        GREATER_THAN,
        //小于等于
        LESS_THAN,
        //右模糊查询
        RIGHT_LIKE,
        //左模糊查询
        LEFT_LIKE,
        //中模糊查询
        INNER_LIKE,
        //小于
        LESS_THAN_NQ,
        //包含
        IN,
        // 不等于
        NOT_EQUAL,
        //之间
        BETWEEN,
        //不为空
        NOT_NULL,
        IS_NULL,
    }
    enum Join{
        //左右连接
        LEFT,
        RIGHT,
        INNER,
    }
}
