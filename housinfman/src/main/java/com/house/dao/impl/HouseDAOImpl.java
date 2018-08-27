package com.house.dao.impl;

import com.house.dao.MyBatisBaseDao;
import com.house.pojo.House;
import com.house.tools.JDBCUtil;
import com.house.tools.SSMUtil;
import com.house.tools.SqlSeparate;

import java.util.List;

/**
 * HouseDAO继承基类
 */
public class HouseDAOImpl implements MyBatisBaseDao<House, Integer> {
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(House record) {
        return 0;
    }

    public int insertSelective(House record) {
        return 0;
    }

    public House selectByPrimaryKey(Integer id) {
        return null;
    }

    public int updateByPrimaryKeySelective(House record) {
        return 0;
    }

    public int updateByPrimaryKey(House record) {
        return 0;
    }

    public List<House> searchAll() {
        String sql = SqlSeparate.getSql(getClass());
        return JDBCUtil.dbDQLWithSQL(sql,House.class);

    }

    public static void main(String[] args) {
        System.out.println(new HouseDAOImpl().searchAll());
    }
}