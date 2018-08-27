package com.house.dao.impl;

import com.house.dao.MyBatisBaseDao;
import com.house.pojo.RolePrivilegeKey;

import java.util.List;

/**
 * RolePrivilegeDAO继承基类
 */
public class RolePrivilegeDAOImpl implements MyBatisBaseDao<RolePrivilegeKey,Integer> {
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(RolePrivilegeKey record) {
        return 0;
    }

    public int insertSelective(RolePrivilegeKey record) {
        return 0;
    }

    public RolePrivilegeKey selectByPrimaryKey(Integer id) {
        return null;
    }

    public int updateByPrimaryKeySelective(RolePrivilegeKey record) {
        return 0;
    }

    public int updateByPrimaryKey(RolePrivilegeKey record) {
        return 0;
    }

    public List<RolePrivilegeKey> searchAll() {
        return null;
    }
}