package com.Egg.spring.testDemo;

import com.Egg.spring.Book;
import com.Egg.spring.Order;
import com.Egg.spring.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTest {

    @Test
    public void testAdd(){
        //1.加载spring配置文件
        //共两种方式：ApplicationContext和BeanFactory
        //但BeanFactory一般供Spring内部使用，不用于开发
        ApplicationContext context1 =
                new ClassPathXmlApplicationContext("bean1.xml");
        BeanFactory context2 =
                new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置创建的对象
        User user1 = context1.getBean("user", User.class);
        User user2 = context2.getBean("user", User.class);

        System.out.println(user1);
        user1.add();

        System.out.println(user2);
        user2.add();
    }

    @Test
    public void testBook1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Book book = context.getBean("book", Book.class);

        System.out.println(book.toString());

    }

    @Test
    public void testOrder(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Order order = context.getBean("order", Order.class);

        System.out.println(order.toString());
    }

}
