package com.house.dao.impl;


import com.house.dao.MyBatisBaseDao;
import com.house.dao.RectDAO;
import com.house.pojo.Rect;
import com.house.tools.JDBCUtil;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * RectDAO继承基类
 */
public class RectDAOImpl implements RectDAO {

    public int deleteByPrimaryKey(Integer id) {

        String sql = " delete from rect where r_id = ?";
        if (JDBCUtil.daDMLWithSQL(sql, id)) {
            return 1;
        } else {
            return 0;
        }
    }

    public int insert(Rect record) {
        String sql = " insert into rect (r_id, h_id, l_id, " +
                "      r_money, r_time, r_remark" +
                "      )" +
                "    values (?,?,?,?,?,?)";
        if (JDBCUtil.daDMLWithSQL(sql, record.getrId(), record.gethId(), record.getlId(), record.getrMoney(),
                record.getrTime(), record.getrRemark())) {
            return 1;
        } else {
            return 0;
        }
    }

    public int insertSelective(Rect record) {
        String sql = " insert into rect (r_id, h_id, l_id, " +
                "      r_money, r_time, r_remark" +
                "      )" +
                "    values (?,?,?,?,?,?)";
        if (JDBCUtil.daDMLWithSQL(sql, record.getrId(), record.gethId(), record.getlId(), record.getrMoney(),
                record.getrTime(), record.getrRemark())) {
            return 1;
        } else {
            return 0;
        }
    }

    public Rect selectByPrimaryKey(Integer id) {
        String sql = " select * \n" +
                "    from rect\n" +
                "    where r_id = ? ";
        return (Rect) JDBCUtil.dbDQLWithSQL(sql, Rect.class, id);
    }

    /**
     * 更新选择的内容,没有选择的不更新
     *
     * @param record
     * @return
     */
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

    public int updateByPrimaryKey(Rect record) {
        String sql = "  update rect" +
                "    set r_id = ?," +
                "      h_id = ?," +
                "      l_id = ?," +
                "      r_money = ?," +
                "      r_time = ?," +
                "      r_remark = ?";
        if (JDBCUtil.daDMLWithSQL(sql, record.getrId(), record.gethId(), record.getlId(), record.getrMoney(),
                record.getrTime(), record.getrRemark())) {
            return 1;
        } else {
            return 0;
        }
    }

    public List<Rect> searchAll() {
        String sql = " select *" +
                "    from rect";
        return JDBCUtil.dbDQLWithSQL(sql, Rect.class);
    }
}