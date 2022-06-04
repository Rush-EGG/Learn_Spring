package com.Egg.spring.testDemo;

import com.Egg.spring.autoWire.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAutoWire {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean11.xml");

        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp);
    }
}
