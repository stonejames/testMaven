package com.baizhi.service.impl;

import com.baizhi.dao.DeptDao;
import com.baizhi.entity.Dept;
import com.baizhi.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/12/4.
 */
@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptDao deptDao;

    public List<Dept> selectAll() {
        return deptDao.selectAll();
    }
}
