package com.Egg.spring.service;

import com.Egg.spring.dao.ResourceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ResourceService {
    @Autowired
    private ResourceDao resourceDao;

    @Value(value = "C")
    private String name;

    public void m(){
        System.out.println("Service m..." + name);
        resourceDao.m();
    }
}
