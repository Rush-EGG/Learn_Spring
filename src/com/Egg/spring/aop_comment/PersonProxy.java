package com.Egg.spring.aop_comment;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1) //优先级1，数字越大越低
public class PersonProxy {
    //前置通知
    //Before表示该方法作为前置通知
    @Before(value = "execution(* com.Egg.spring.aop_comment.User.add(..))")
    public void before() {
        System.out.println("Person before...");
    }
}
