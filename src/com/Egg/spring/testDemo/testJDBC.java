package com.Egg.spring.testDemo;

import com.Egg.spring.JDBCTemplate.entity.User;
import com.Egg.spring.JDBCTemplate.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testJDBC {
    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean17.xml");

        BookService bookService = context.getBean("bookService", BookService.class);

        User user = new User();
        user.setUserId(5);
        user.setUserName("卢小喷");
        user.setUserState("吃吃吃");

        bookService.addBook(user);
    }

    @Test
    public void testUpdate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean17.xml");

        BookService bookService = context.getBean("bookService", BookService.class);

        User user = new User();
        user.setUserId(1);
        user.setUserName("卢大喷");

        bookService.updateBook(user);
    }

    @Test
    public void testDelete(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean17.xml");

        BookService bookService = context.getBean("bookService", BookService.class);

        User user = new User();
        user.setUserId(1);

        bookService.deleteBook(user);
    }

}
