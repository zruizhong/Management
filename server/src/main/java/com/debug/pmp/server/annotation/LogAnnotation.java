package com.debug.pmp.server.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2019/8/5.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAnnotation {

    String value() default "";

}
