package com.yu.theone.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by shuwei.yu.
 * on 2019/4/4.
 */
public class testAnnotation {

    @Target({ ElementType.FIELD, ElementType.METHOD })
    @Retention(RetentionPolicy.RUNTIME)
    public @interface annotationA{

        public String age() default "";
        public String address() default "";

    }

}
