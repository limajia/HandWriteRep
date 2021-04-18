package com.docker.lib_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * {@link ddd}
 *
 * @author docker
 */
@Retention(RetentionPolicy.RUNTIME) //在运行时使用 则需要这个 AnnotationProcess改为source
@Target(ElementType.FIELD)
public @interface BindView {
    int value();

//    int id(); // 赋值属性 方法的样子
//
//    String name() default "docker";
}
