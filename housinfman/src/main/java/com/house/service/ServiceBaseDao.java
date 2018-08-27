package com.house.service;

import java.io.Serializable;
import java.util.List;

public interface ServiceBaseDao <Model, PK extends Serializable>{

    int deleteByPrimaryKey(PK id);

    int insert(Model record);

    int insertSelective(Model record);


    Model selectByPrimaryKey(PK id);


    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);


    List<Model> searchAll();


}
