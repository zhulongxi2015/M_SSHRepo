package com.longxi.service.impl;

import com.longxi.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    public void test() {
        System.out.println("test");
    }
}
