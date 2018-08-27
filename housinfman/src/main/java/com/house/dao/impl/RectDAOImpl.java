package com.house.dao.impl;


import com.house.dao.MyBatisBaseDao;
import com.house.dao.RectDAO;
import com.house.pojo.Rect;
import com.house.tools.JDBCUtil;
import com.house.tools.SSMUtil;
import com.house.tools.SqlSeparate;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author DinGYun
 * RectDAO继承基类
 */
public class RectDAOImpl implements RectDAO {

    @Override
    public int deleteByPrimaryKey(Integer id) {

        String sql = SqlSeparate.getSql(getClass());
        return JDBCUtil.daDMLWithSQL(sql, id) ? 1 : 0;
    }

    @Override
    public int insert(Rect record) {
        String sql = SqlSeparate.getSql(getClass());
        return JDBCUtil.daDMLWithSQL(sql, record.getrId(), record.gethId(), record.getlId(), record.getrMoney(),
                record.getrTime(), record.getrRemark()) ? 1 : 0;
    }

    @Override
    public int insertSelective(Rect record) {
        String sql = SqlSeparate.getSql(getClass());
        return JDBCUtil.daDMLWithSQL(sql, record.getrId(), record.gethId(), record.getlId(), record.getrMoney(),
                record.getrTime(), record.getrRemark()) ? 1 : 0;
    }

    @Override
    public Rect selectByPrimaryKey(Integer id) {
        String sql = SqlSeparate.getSql(getClass());
        return (Rect) JDBCUtil.dbDQLWithSQL(sql, Rect.class, id);
    }

    /**
     * 更新选择的内容,没有选择的不更新
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKeySelective(Rect record) {
        Rect rect = this.selectByPrimaryKey(record.gethId());
        Date time = Calendar.getInstance().getTime();
        record.sethId(record.gethId() == null ? rect.gethId() : record.gethId());
        record.setlId(record.getrId() == null ? rect.getrId() : record.getrId());
        record.setlId(record.getlId() == null ? rect.getlId() : record.getlId());
        record.setrMoney(record.getrMoney() == null ? rect.getrMoney() : record.getrMoney());
        record.setrTime(record.getrTime() == null ? rect.getrTime() : record.getrTime());
        record.setrRemark(record.getrRemark() == null ? rect.getrRemark() : record.getrRemark());


        return this.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKey(Rect record) {
        String sql = SqlSeparate.getSql(getClass());
        return JDBCUtil.daDMLWithSQL(sql, record.getrId(), record.gethId(), record.getlId(), record.getrMoney(),
                record.getrTime(), record.getrRemark()) ? 1 : 0;
    }

    @Override
    public List<Rect> searchAll() {
        String sql = SqlSeparate.getSql(getClass());
        return JDBCUtil.dbDQLWithSQL(sql, Rect.class);
    }
}