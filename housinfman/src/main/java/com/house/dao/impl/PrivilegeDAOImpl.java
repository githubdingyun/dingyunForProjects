package com.house.dao.impl;


import com.house.dao.MyBatisBaseDao;
import com.house.pojo.Privilege;

import java.util.List;

/**
 * PrivilegeDAO继承基类
 */
public class PrivilegeDAOImpl implements MyBatisBaseDao<Privilege, Integer> {
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(Privilege record) {
        return 0;
    }

    public int insertSelective(Privilege record) {
        return 0;
    }

    public Privilege selectByPrimaryKey(Integer id) {
        return null;
    }

    public int updateByPrimaryKeySelective(Privilege record) {
        return 0;
    }

    public int updateByPrimaryKey(Privilege record) {
        return 0;
    }

    public List<Privilege> searchAll() {
        return null;
    }
}