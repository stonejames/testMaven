package com.baizhi.dao;

import com.baizhi.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/11/28.
 */
public interface UserDao {

    public User selectUser(User u);

}
