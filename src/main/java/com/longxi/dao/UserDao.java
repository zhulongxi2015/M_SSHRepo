package com.longxi.dao;

import com.longxi.model.User;

import java.io.Serializable;

public interface UserDao {
    Serializable save(User user);
}
