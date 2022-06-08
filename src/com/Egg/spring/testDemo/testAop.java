package com.Egg.spring.testDemo;

import com.Egg.spring.aop_comment.User;
import com.Egg.spring.aop_xml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAop {
    @Test
    public void testAOP_comment(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean15.xml");

        User user = context.getBean("user", User.class);

        user.add();
    }

    @Test
    public void testAOP_xml(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean16.xml");

        Book book = context.getBean("book", Book.class);

        book.buy();
    }
}
