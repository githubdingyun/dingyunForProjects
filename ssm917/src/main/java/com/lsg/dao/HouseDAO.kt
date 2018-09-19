package com.lsg.dao

import com.lsg.model.House
import com.lsg.model.HouseExample
import org.springframework.stereotype.Repository

/**
 * HouseDAO继承基类
 */
@Repository
interface HouseDAO : MyBatisBaseDao<House, Int, HouseExample>