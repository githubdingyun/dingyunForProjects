package com.house.dao.impl;

import com.house.dao.MyBatisBaseDao;
import com.house.pojo.User;
import com.house.tools.JDBCUtil;
import com.house.tools.SqlSeparate;

import java.util.List;

/**
 * UserDAO继承基类
 */
public class UserDAOImpl implements MyBatisBaseDao<User, Integer> {
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(User record) {
        return 0;
    }

    public int insertSelective(User record) {
        return 0;
    }

    public User selectByPrimaryKey(Integer id) {
        return null;
    }

    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    public int updateByPrimaryKey(User record) {
        return 0;
    }

    public List<User> searchAll() {
        String sql = SqlSeparate.getSql(getClass());
        List<User> users = JDBCUtil.dbDQLWithSQL(sql, User.class);
        return users;
    }


    public static void main(String[] args) {

        System.out.println(new UserDAOImpl().searchAll());

    }
}