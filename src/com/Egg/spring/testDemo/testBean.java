package com.Egg.spring.testDemo;

import com.Egg.spring.bean.Emp;
import com.Egg.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testBean {
    @Test
    public void testUserService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }

    @Test
    public void testEmp1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp.toString());
    }

    @Test
    public void testEmp2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp.toString());
    }

    @Test
    public void testEmp3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");

        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp.toString());
    }
}
