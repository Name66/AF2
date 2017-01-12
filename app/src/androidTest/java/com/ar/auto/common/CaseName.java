package com.ar.auto.common;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface CaseName {
    public abstract String value();
}