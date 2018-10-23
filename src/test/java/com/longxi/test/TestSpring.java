package com.longxi.test;

import com.longxi.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        UserService service=(UserService)context.getBean("userService");
    }
}
