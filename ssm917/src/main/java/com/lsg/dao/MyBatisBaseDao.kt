package com.lsg.dao

import org.apache.ibatis.annotations.Param

import java.io.Serializable

/**
 * DAO公共基类，由MybatisGenerator自动生成请勿修改
 * @param <Model> The Model Class 这里是泛型不是Model类
 * @param <PK> The Primary Key Class 如果是无主键，则可以用Model来跳过，如果是多主键则是Key类
 * @param <E> The Example Class
</E></PK></Model> */
interface MyBatisBaseDao<Model, PK : Serializable, E> {
    fun countByExample(example: E): Long

    fun deleteByExample(example: E): Int

    fun deleteByPrimaryKey(id: PK): Int

    fun insert(record: Model): Int

    fun insertSelective(record: Model): Int

    fun selectByExample(example: E): List<Model>

    fun selectByPrimaryKey(id: PK): Model

    fun updateByExampleSelective(@Param("record") record: Model, @Param("example") example: E): Int

    fun updateByExample(@Param("record") record: Model, @Param("example") example: E): Int

    fun updateByPrimaryKeySelective(record: Model): Int

    fun updateByPrimaryKey(record: Model): Int
}