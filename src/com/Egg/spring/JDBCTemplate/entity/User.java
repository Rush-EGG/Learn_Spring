package com.Egg.spring.JDBCTemplate.entity;

public class User {
    private int userId;
    private String userName;
    private String userState;

    public String getUserName() {
        return userName;
    }

    public String getUserState() {
        return userState;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }
}
