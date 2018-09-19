package com.lsg.dao

import com.lsg.model.Rect
import com.lsg.model.RectExample
import org.springframework.stereotype.Repository

/**
 * RectDAO继承基类
 */
@Repository
interface RectDAO : MyBatisBaseDao<Rect, Int, RectExample>