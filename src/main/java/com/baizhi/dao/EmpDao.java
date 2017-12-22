package com.baizhi.dao;

import com.baizhi.entity.Emp;

import java.util.List;

/**
 * Created by Administrator on 2017/12/1.
 */
public interface EmpDao {

    public List<Emp> selectAll();

    //增删改查
    public int insertEmp(Emp emp);
    //删除
    public int deleteEmp(int id);

    public int updateEmp(Emp emp);

    public Emp selectOne(int id);

    public int deleteSome(int[] ids);

}
