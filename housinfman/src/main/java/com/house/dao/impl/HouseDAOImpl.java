package com.house.dao.impl;

import com.house.dao.MyBatisBaseDao;
import com.house.pojo.House;
import com.house.tools.JDBCUtil;
import com.house.tools.SqlSeparate;

import java.util.List;

/**
 * HouseDAO继承基类
 */
public class HouseDAOImpl implements MyBatisBaseDao<House, Integer> {
    @Override
    public int deleteByPrimaryKey(Integer id) {

        String sql = SqlSeparate.getSql(getClass());
        return JDBCUtil.daDMLWithSQL(sql, id) ? 1 : 0;
    }

    @Override
    public int insert(House record) {
        String sql = SqlSeparate.getSql(getClass());
        return JDBCUtil.daDMLWithSQL(sql,record.gethId(),record.gethArea(),record.gethEstate(),
                record.gethUnitnumber(),record.gethFloor(),record.gethRoomno(),
                record.gethAcreage(),record.gethDirection(),record.gethFitment(),
                record.gethIsdoubleair(),record.gethLimit(),record.gethFacility(),
                record.gethPrice(),record.gethStatus(),record.gethImg(),record.gethAddress(),
                record.gethAddtime(),record.gethUpdatetime()) ? 1 : 0;
    }

    @Override
    public int insertSelective(House record) {
        String sql = SqlSeparate.getSql(getClass());
        return JDBCUtil.daDMLWithSQL(sql,record.gethId(),record.gethArea(),record.gethEstate(),
                record.gethUnitnumber(),record.gethFloor(),record.gethRoomno(),
                record.gethAcreage(),record.gethDirection(),record.gethFitment(),
                record.gethIsdoubleair(),record.gethLimit(),record.gethFacility(),
                record.gethPrice(),record.gethStatus(),record.gethImg(),record.gethAddress(),
                record.gethAddtime(),record.gethUpdatetime()) ? 1 : 0;
    }

    @Override
    public House selectByPrimaryKey(Integer id) {
        String sql = SqlSeparate.getSql(getClass());
        return (House) JDBCUtil.dbDQLWithSQL(sql, House.class, id);
    }

    /**
     * 更新选择的内容,没有选择的不更新
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKeySelective(House record) {
        return this.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKey(House record) {
        String sql = SqlSeparate.getSql(getClass());
        return JDBCUtil.daDMLWithSQL(sql,record.gethId(),record.gethArea(),record.gethEstate(),
                record.gethUnitnumber(),record.gethFloor(),record.gethRoomno(),
                record.gethAcreage(),record.gethDirection(),record.gethFitment(),
                record.gethIsdoubleair(),record.gethLimit(),record.gethFacility(),
                record.gethPrice(),record.gethStatus(),record.gethImg(),record.gethAddress(),
                record.gethAddtime(),record.gethUpdatetime()) ? 1 : 0;
    }

    @Override
    public List<House> searchAll() {
        String sql = SqlSeparate.getSql(getClass());
        return JDBCUtil.dbDQLWithSQL(sql, House.class);
    }

    public static void main(String[] args) {
        System.out.println(new HouseDAOImpl().searchAll());
    }
}