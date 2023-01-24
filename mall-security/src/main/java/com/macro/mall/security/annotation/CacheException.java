package com.macro.mall.security.annotation;

import java.lang.annotation.*;

/**
 * 自定义缓存异常注解，有该注解的缓存方法会抛出异常
 * Created by macro on 2020/3/17.
 */
//生成文档
@Documented
//能在方法上使用该注解
@Target(ElementType.METHOD)
//注释要保留多长时间
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}
