package com.Egg.spring.testDemo;

import com.Egg.spring.collectionType.Course;
import com.Egg.spring.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testFactoryBean {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean8.xml");

        //因为MyBean类继承了FactoryBean接口，且定义了泛型<Course>，所以返回的类型是Course
        Course course = context.getBean("myBean", Course.class);

        System.out.println(course);
    }
}
