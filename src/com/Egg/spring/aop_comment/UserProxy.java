package com.Egg.spring.aop_comment;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强的类
@Component
@Aspect //生成代理对象
@Order(5) //优先级5，数字越大越低
public class UserProxy {

    //抽取相同的切入点
    @Pointcut(value = "execution(* com.Egg.spring.aop_comment.User.add(..))")
    public void pointcut(){
    }

    //前置通知
    //Before表示该方法作为前置通知
    @Before(value = "pointcut()")
    public void before() {
        System.out.println("before...");
    }

    //最终通知
    @After(value = "execution(* com.Egg.spring.aop_comment.User.add(..))")
    public void after(){
        System.out.println("after...");
    }

    //返回通知
    @AfterReturning(value = "execution(* com.Egg.spring.aop_comment.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning...");
    }

    //异常通知
    @AfterThrowing(value = "execution(* com.Egg.spring.aop_comment.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing...");
    }

    //环绕通知
    @Around(value = "execution(* com.Egg.spring.aop_comment.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕之前...");

        //被增强的方法
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后...");
    }
}
