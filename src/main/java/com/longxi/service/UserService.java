package com.longxi.service;

import com.longxi.model.User;

import java.io.Serializable;

public interface UserService {
    /**
     *
     * @return
     */
    Serializable save(User user);
  }
