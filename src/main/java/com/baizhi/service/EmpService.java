package com.baizhi.service;

import com.baizhi.entity.Emp;

import java.util.List;


/**
 * Created by Administrator on 2017/12/1.
 */
public interface EmpService {

    public List<Emp> selectAll();

    public int insertEmp(Emp emp);

    //删除
    public int deleteEmp(int id);

    public int updateEmp(Emp emp);

    public Emp selectOne(int id);

    public int deleteSome(int[] ids);

}
