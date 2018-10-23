package com.longxi.service.impl;

import com.longxi.dao.UserDao;
import com.longxi.model.User;
import com.longxi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public Serializable save(User user) {
        return userDao.save(user);
    }
}
