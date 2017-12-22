package com.baizhi.controller;

import com.baizhi.service.DeptService;
import org.apache.poi.ss.formula.functions.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/12/4.
 */
@Controller
@RequestMapping("/dept")
public class DeptController {

       @Autowired
       private DeptService deptService;

       @RequestMapping("/selectAll")
       public ModelAndView selectAll(){
           System.out.println("查询部门....");
           ModelAndView mv = new ModelAndView();
           mv.setViewName("addEmp");
           mv.addObject("deptList",deptService.selectAll());
           return mv;
       }

}
