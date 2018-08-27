package com.house.dao.impl;


import com.house.dao.MyBatisBaseDao;
import com.house.pojo.Lessee;

import java.util.List;

/**
 * LesseeDAO继承基类
 */
public class LesseeDAOImpl implements MyBatisBaseDao<Lessee,Integer> {

    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(Lessee record) {
        return 0;
    }

    public int insertSelective(Lessee record) {
        return 0;
    }

    public Lessee selectByPrimaryKey(Integer id) {
        return null;
    }

    public int updateByPrimaryKeySelective(Lessee record) {
        return 0;
    }

    public int updateByPrimaryKey(Lessee record) {
        return 0;
    }

    public List<Lessee> searchAll() {
        return null;
    }
}