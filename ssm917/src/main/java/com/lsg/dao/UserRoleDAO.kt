package com.lsg.dao

import com.lsg.model.UserRoleExample
import com.lsg.model.UserRoleKey
import org.springframework.stereotype.Repository

/**
 * UserRoleDAO继承基类
 */
@Repository
interface UserRoleDAO : MyBatisBaseDao<UserRoleKey, Int, UserRoleExample>