package com.Egg.spring.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ResourceDaoImpl implements ResourceDao{
    @Override
    public void m() {
        System.out.println("dao m...");
    }
}
