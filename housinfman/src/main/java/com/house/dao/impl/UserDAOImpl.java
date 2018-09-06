package com.house.dao.impl;

import com.house.dao.MyBatisBaseDao;
import com.house.pojo.User;
import com.house.tools.JDBCUtil;
import com.house.tools.SqlSeparate;

import java.util.List;
import java.util.Objects;

/**
 * @author DinGYun
 * UserDAO继承基类
 */
public class UserDAOImpl implements MyBatisBaseDao<User, Integer> {
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(User record) {
        String sql = SqlSeparate.getSql(getClass());
        boolean b = JDBCUtil.daDMLWithSQL(sql, record.getuId(), record.getuName(), record.getuPassword(),
                record.getuStatus(), record.getuTel(), record.getuUsername());
        return b ? 1 : 0;

    }

    public int insertSelective(User record) {
        String sql = SqlSeparate.getSql(getClass());
        boolean b = JDBCUtil.daDMLWithSQL(sql, record.getuId(), record.getuName(), record.getuPassword(),
                record.getuStatus(), record.getuTel(), record.getuUsername());
        return b ? 1 : 0;
    }

    public User selectByPrimaryKey(Integer id) {
        String sql = SqlSeparate.getSql(getClass());
        List<User> users = JDBCUtil.dbDQLWithSQL(sql, User.class, id);
        assert users != null;
        return users.isEmpty() ? new User() : users.get(0);
    }

    public int updateByPrimaryKeySelective(User record) {
        String sql = SqlSeparate.getSql(getClass());
        boolean b = JDBCUtil.daDMLWithSQL(sql, record.getuId(), record.getuName(), record.getuPassword(),
                record.getuStatus(), record.getuTel(), record.getuUsername());
        return b ? 1 : 0;
    }

    public int updateByPrimaryKey(User record) {
        String sql = SqlSeparate.getSql(getClass());
        boolean b = JDBCUtil.daDMLWithSQL(sql, record.getuId(), record.getuName(), record.getuPassword(),
                record.getuStatus(), record.getuTel(), record.getuUsername());
        return b ? 1 : 0;
    }

    public List<User> searchAll() {
        String sql = SqlSeparate.getSql(getClass());
        return JDBCUtil.dbDQLWithSQL(sql, User.class);
    }


    public Boolean userAuthentication(User record) {
        String sql = SqlSeparate.getSql(getClass());
        List<User> users = JDBCUtil.dbDQLWithSQL(sql, User.class,record.getuUsername(),record.getuPassword());
        return !users.isEmpty();

    }

    public Boolean accountVerification(User record) {
        String sql = SqlSeparate.getSql(getClass());
        List<User> users = JDBCUtil.dbDQLWithSQL(sql, User.class,record.getuUsername());
        return !Objects.requireNonNull(users).isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(new UserDAOImpl().searchAll());

    }
}