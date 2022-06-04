package com.Egg.spring.service;

import com.Egg.spring.dao.UserDao;
import com.Egg.spring.dao.UserDao_new;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component(value = "userService_new") //value给这个类起了一个别名，默认值将类名首字母小写赋值
@Service
public class UserService_new {

    // 定义dao类型属性,不需要set方法
    @Autowired //根据类型进行注入.但如果有多个该接口的实现类,那么它会错乱,这时可以和@Qualifier一起使用,来指定实现类的名称
    @Qualifier(value = "userDaoImpl_new_new")
    private UserDao_new userDao_new;

    public void add(){
        System.out.println("service add...");
        userDao_new.add();
    }
}
