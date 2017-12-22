package com.baizhi.controller;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/12/1.
 */
@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("/selectAll")
    public ModelAndView selectAll(){
        List<Emp> emps = empService.selectAll();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("emplist");
        mv.addObject("emplist",emps);
        return mv;
    }

    @RequestMapping("/insert")
    public String insert(Emp emp){
        empService.insertEmp(emp);
        return "redirect:selectAll";
    }

    @RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable("id") int id){
        empService.deleteEmp(id);
        return "redirect:/emp/selectAll";
    }

    @RequestMapping("/deleteSome")
    public String deleteSome(int[] ids){
        empService.deleteSome(ids);
        return "redirect:selectAll";
    }

    @RequestMapping(value = "/selectOne/{id}")
    public ModelAndView selectOne(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView();
        Emp emp = empService.selectOne(id);
        mv.setViewName("updateEmp");
        mv.addObject("emp",emp);
        return mv;
    }

    @RequestMapping(value = "/update")
    public String update(Emp emp){
        empService.updateEmp(emp);
        return "redirect:/emp/selectAll";
    }


}