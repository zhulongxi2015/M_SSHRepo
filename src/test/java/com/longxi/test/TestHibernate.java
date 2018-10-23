package com.longxi.test;

import com.longxi.model.User;
import com.longxi.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHibernate {
    private UserService userService;
    @Before
    public  void before(){
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
        userService =(UserService)ac.getBean("userService");
    }
    @Test
    public void method(){
        User user=new User("longxi2","123",22);
        userService.save(user);
    }
}
