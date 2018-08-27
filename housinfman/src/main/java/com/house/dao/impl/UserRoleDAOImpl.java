package com.house.dao.impl;


import com.house.dao.MyBatisBaseDao;
import com.house.pojo.UserRoleKey;

import java.util.List;

/**
 * UserRoleDAO继承基类
 */
public class UserRoleDAOImpl implements MyBatisBaseDao<UserRoleKey,Integer> {
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(UserRoleKey record) {
        return 0;
    }

    public int insertSelective(UserRoleKey record) {
        return 0;
    }

    public UserRoleKey selectByPrimaryKey(Integer id) {
        return null;
    }

    public int updateByPrimaryKeySelective(UserRoleKey record) {
        return 0;
    }

    public int updateByPrimaryKey(UserRoleKey record) {
        return 0;
    }

    public List<UserRoleKey> searchAll() {
        return null;
    }
}