package com.tan.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 自定义注解
 * @date 2021-4-9 12:17
 * @author 木佑君
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String name() default "zhangsan";
    int age();
}
