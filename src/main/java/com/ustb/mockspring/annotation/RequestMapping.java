package com.ustb.mockspring.annotation;

import java.lang.annotation.*;

/**
 * 标记请求的注解
 * Created by ustbgao on 15-8-26.
 */
@Target({ElementType.METHOD , ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestMapping {
    public String value() default "";
}
