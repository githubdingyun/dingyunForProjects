package com.house.dao.impl;

import com.house.dao.MyBatisBaseDao;
import com.house.pojo.Role;

import java.util.List;

/**
 * RoleDAO继承基类
 */
public class RoleDAOImpl implements MyBatisBaseDao<Role, Integer> {
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(Role record) {
        return 0;
    }

    public int insertSelective(Role record) {
        return 0;
    }

    public Role selectByPrimaryKey(Integer id) {
        return null;
    }

    public int updateByPrimaryKeySelective(Role record) {
        return 0;
    }

    public int updateByPrimaryKey(Role record) {
        return 0;
    }

    public List<Role> searchAll() {
        return null;
    }
}