package com.smart4j.framework.annotation;

import java.lang.annotation.*;

/**
 * Created by DELL on 2018/4/1.
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {

    Class<? extends Annotation> value();
}
