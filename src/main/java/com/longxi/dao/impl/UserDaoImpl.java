package com.longxi.dao.impl;

import com.longxi.dao.MyDaoSupport;
import com.longxi.dao.UserDao;
import com.longxi.model.User;
import jdk.nashorn.internal.objects.annotations.Property;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository("userDao")
public class UserDaoImpl extends MyDaoSupport implements UserDao {
    public Serializable save(User user) {
       return this.getHibernateTemplate().save(user);
    }
}
