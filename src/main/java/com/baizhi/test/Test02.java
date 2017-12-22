package com.baizhi.test;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import com.baizhi.service.UserService;
import com.baizhi.service.impl.EmpServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2017/12/1.
 */
public class Test02 {

    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
        //UserService service = (UserService) application.getBean("userService");

        EmpService service = (EmpService) application.getBean("empService");
        List<Emp> empList = service.selectAll();
        for (Emp e:empList){
            System.out.println(e);
        }
    }

}
