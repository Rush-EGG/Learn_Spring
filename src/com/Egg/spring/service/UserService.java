package com.Egg.spring.service;

import com.Egg.spring.dao.UserDao;
import com.Egg.spring.dao.UserDaoImpl;

public class UserService {

    //利用xml方式
    //创建UserDao类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("我是猪");

        //原始方式
        //创建UserDao对象，再调用方法
        //UserDao userDao = new UserDaoImpl();

        userDao.update();
    }
}
