package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    UserDao userDao;

    @Override
    public void save() {
        System.out.println("service is running...");
    }

    @Override
    public List<User> findAll() {
        System.out.println("service 查询");
        return userDao.findAll();
    }


}
