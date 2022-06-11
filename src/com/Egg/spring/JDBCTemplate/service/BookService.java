package com.Egg.spring.JDBCTemplate.service;

import com.Egg.spring.JDBCTemplate.dao.BookDao;
import com.Egg.spring.JDBCTemplate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    //注入DAO
    @Autowired
    private BookDao bookDao;

    //添加的方法
    public void addBook(User user){
        bookDao.add(user);
    }

    public void updateBook(User user){
        bookDao.update(user);
    }

    public void deleteBook(User user){
        bookDao.delete(user.getUserId());
    }

}
