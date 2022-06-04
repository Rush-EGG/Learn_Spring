package com.Egg.spring.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "userDaoImpl_new_new")
public class UserDaoImpl_new implements UserDao_new{
    @Override
    public void add() {
        System.out.println("dao add...");
    }
}
