package com.lsg.dao

import com.lsg.model.Lessee
import com.lsg.model.LesseeExample
import org.springframework.stereotype.Repository

/**
 * LesseeDAO继承基类
 */
@Repository
interface LesseeDAO : MyBatisBaseDao<Lessee, Int, LesseeExample>