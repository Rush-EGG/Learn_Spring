package com.Egg.spring.factorybean;

import com.Egg.spring.collectionType.Course;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Course> {
    //定义返回的bean对象的类型
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("C艹");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
