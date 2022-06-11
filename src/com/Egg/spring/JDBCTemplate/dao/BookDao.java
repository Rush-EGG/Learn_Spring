package com.Egg.spring.JDBCTemplate.dao;

import com.Egg.spring.JDBCTemplate.entity.User;

public interface BookDao {
    void add(User user);
    void update(User user);
    void delete(int id);

}
