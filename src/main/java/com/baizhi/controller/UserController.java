package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/11/30.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login(User u){
        System.out.println(u);
        User u2 = userService.selectUser(u);
        if(u2 == null)
            return "error";
        return "redirect:/emp/selectAll";
    }


    @ResponseBody
    @RequestMapping(value = "/test1")
    public User test1(){
        String str = "用户名已经存在";
        User u = new User();
        u.setUsername("呵呵");
        return u;
    }
}
