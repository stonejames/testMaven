package com.baizhi.service.impl;

import com.baizhi.dao.EmpDao;
import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/12/1.
 */
@Service("empService")
public class EmpServiceImpl implements EmpService{

    @Autowired
    private EmpDao empDao;

    public List<Emp> selectAll() {
        return empDao.selectAll();
    }

    public int insertEmp(Emp emp) {
        return empDao.insertEmp(emp);
    }


    public int deleteEmp(int id) {
        return empDao.deleteEmp(id);
    }

    public int updateEmp(Emp emp) {
        return empDao.updateEmp(emp);
    }

    public Emp selectOne(int id) {
        return empDao.selectOne(id);
    }

    public int deleteSome(int[] ids) {
        return empDao.deleteSome(ids);
    }
}
