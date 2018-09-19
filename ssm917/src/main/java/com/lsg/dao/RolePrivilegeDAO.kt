package com.lsg.dao

import com.lsg.model.RolePrivilegeExample
import com.lsg.model.RolePrivilegeKey
import org.springframework.stereotype.Repository

/**
 * RolePrivilegeDAO继承基类
 */
@Repository
interface RolePrivilegeDAO : MyBatisBaseDao<RolePrivilegeKey, Int, RolePrivilegeExample>