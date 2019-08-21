package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

public interface TestService {
    void save();

    List<User> findAll();
}
