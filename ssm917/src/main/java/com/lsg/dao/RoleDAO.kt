package com.lsg.dao

import com.lsg.model.Role
import com.lsg.model.RoleExample
import org.springframework.stereotype.Repository

/**
 * RoleDAO继承基类
 */
@Repository
interface RoleDAO : MyBatisBaseDao<Role, Int, RoleExample>