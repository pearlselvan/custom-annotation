package com.pearl.annodation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface MobileTest {
    String name() default "muthu";
}
