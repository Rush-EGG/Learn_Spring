package com.Egg.spring.testDemo;

import com.Egg.spring.collectionType.Course;
import com.Egg.spring.durationOfBean.Order;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDurationOfBean {
    @Test
    public void testDuration(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean10.xml");

        Order order = context.getBean("order", Order.class);
        System.out.println("第四步 获取创建的bean对象");

        System.out.println(order);

        // 手动销毁bean实例
        ((ClassPathXmlApplicationContext) context).close();
    }
}
