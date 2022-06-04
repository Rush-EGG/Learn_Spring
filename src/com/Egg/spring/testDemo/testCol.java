package com.Egg.spring.testDemo;

import com.Egg.spring.collectionType.Book;
import com.Egg.spring.collectionType.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testCol {
    @Test
    public void testStu(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");

        Stu stu = context.getBean("stu", Stu.class);

        System.out.println(stu.toString());
    }

    @Test
    public void testBook1(){
        // 执行完下面一行语句时已经创建了单实例对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");

        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);

//        System.out.println(book.toString());
        // 默认情况是单实例对象，两个对象在内存中的地址是一致的
        System.out.println(book1); // com.Egg.spring.collectionType.Book@2ab4bc72
        System.out.println(book2); // com.Egg.spring.collectionType.Book@2ab4bc72
    }

    @Test
    public void testBook2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean9.xml");

        // 在getBean之后才会创建实例对象
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);

//        System.out.println(book.toString());
        // 设置了bean标签中的scope属性为prototype之后，改为多实例对象了
        System.out.println(book1); // com.Egg.spring.collectionType.Book@2ab4bc72
        System.out.println(book2); // com.Egg.spring.collectionType.Book@4e5ed836
    }
}
