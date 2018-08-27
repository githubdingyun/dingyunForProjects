package com.house.dao;

import java.io.Serializable;
import java.util.List;

/**
 * DAO公共基类，由MybatisGenerator自动生成请勿修改
 * @author DinGYun
 * @param <Model> The Model Class 这里是泛型不是Model类
 * @param <PK>    The Primary Key Class 如果是无主键，则可以用Model来跳过，如果是多主键则是Key类
 *
 *
 *            ----------------------------------------------------------------
 * 这里手动实现mybatis的基本查询功能,关于example的功能以后再看!!
 *
 */
public interface MyBatisBaseDao<Model, PK extends Serializable> {
    int deleteByPrimaryKey(PK id);

    int insert(Model record);

    int insertSelective(Model record);


    Model selectByPrimaryKey(PK id);


    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);


    List<Model> searchAll();

}