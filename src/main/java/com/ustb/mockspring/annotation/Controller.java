package com.ustb.mockspring.annotation;

/**
 * 控制器类注解
 * Created by ustbgao on 15-8-24.
 */

import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Controller {

    public String value() default "";
}
