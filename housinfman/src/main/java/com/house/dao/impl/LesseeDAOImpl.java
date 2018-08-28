package com.house.dao.impl;


import com.house.dao.MyBatisBaseDao;
import com.house.pojo.Lessee;
import com.house.tools.JDBCUtil;
import com.house.tools.SqlSeparate;

import java.util.List;

/**
 * LesseeDAO继承基类
 */
public class LesseeDAOImpl implements MyBatisBaseDao<Lessee,Integer> {


    @Override
    public int deleteByPrimaryKey(Integer id) {

        String sql = SqlSeparate.getSql(getClass());
        return JDBCUtil.daDMLWithSQL(sql, id) ? 1 : 0;
    }

    @Override
    public int insert(Lessee record) {
        String sql = SqlSeparate.getSql(getClass());
        return JDBCUtil.daDMLWithSQL(sql,record.getlId(),record.getlName(),record.getlTel(),
                record.getlSex(),record.getlNativeplace(),record.getlIdcard(),record.getlAddtime()) ? 1 : 0;
    }

    @Override
    public int insertSelective(Lessee record) {
        String sql = SqlSeparate.getSql(getClass());
        return JDBCUtil.daDMLWithSQL(sql,record.getlId(),record.getlName(),record.getlTel(),
                record.getlSex(),record.getlNativeplace(),record.getlIdcard(),record.getlAddtime()) ? 1 : 0;
    }

    @Override
    public Lessee selectByPrimaryKey(Integer id) {
        String sql = SqlSeparate.getSql(getClass());
        return (Lessee) JDBCUtil.dbDQLWithSQL(sql, Lessee.class, id);
    }

    /**
     * 更新选择的内容,没有选择的不更新
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKeySelective(Lessee record) {
        return this.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKey(Lessee record) {
        String sql = SqlSeparate.getSql(getClass());
        return JDBCUtil.daDMLWithSQL(sql,record.getlId(),record.getlName(),record.getlTel(),
                record.getlSex(),record.getlNativeplace(),record.getlIdcard(),record.getlAddtime()) ? 1 : 0;
    }

    @Override
    public List<Lessee> searchAll() {
        String sql = SqlSeparate.getSql(getClass());
        return JDBCUtil.dbDQLWithSQL(sql, Lessee.class);
    }

    public static void main(String[] args) {
        System.out.println(new LesseeDAOImpl().searchAll());
    }

}