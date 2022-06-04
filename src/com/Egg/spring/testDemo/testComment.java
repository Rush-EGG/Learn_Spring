package com.Egg.spring.testDemo;

import com.Egg.spring.config.SpringConfig;
import com.Egg.spring.service.ResourceService;
import com.Egg.spring.service.UserService_new;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testComment {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean13.xml");

        UserService_new userService_new = context.getBean("userService_new", UserService_new.class);

        System.out.println(userService_new);
        userService_new.add();
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean14.xml");

        ResourceService resourceService = context.getBean("resourceService", ResourceService.class);

        resourceService.m();
    }

    @Test
    public void test3(){
        // 加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        ResourceService resourceService = context.getBean("resourceService", ResourceService.class);

        resourceService.m();
    }
}
