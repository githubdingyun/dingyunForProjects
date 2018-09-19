package com.lsg.dao

import com.lsg.model.User
import com.lsg.model.UserExample

/**
 * UserDAO继承基类
 */

interface UserDAO : MyBatisBaseDao<User, Int, UserExample>