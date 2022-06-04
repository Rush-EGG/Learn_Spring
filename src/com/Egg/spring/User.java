package com.Egg.spring;

public class User {

    private String userName;

    public User() {
        System.out.println("无参构造");
    }

    public User(String userName) {
        this.userName = userName;
        System.out.println("有参构造");
    }

    public void add() {
        System.out.println("我是猪");
    }
}
