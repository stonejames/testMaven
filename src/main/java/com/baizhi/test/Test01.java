package com.baizhi.test;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2017/11/28.
 */
public class Test01 {

    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = (UserService) application.getBean("userService");

        User u = new User();
        u.setUsername("张三");
        u.setPassword("12345");
        User u2 = service.selectUser(u);
        System.out.println(u2);


    }
}
