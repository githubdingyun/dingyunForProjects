package com.lsg.dao

import com.lsg.model.Privilege
import com.lsg.model.PrivilegeExample
import org.springframework.stereotype.Repository

/**
 * PrivilegeDAO继承基类
 */
@Repository
interface PrivilegeDAO : MyBatisBaseDao<Privilege, Int, PrivilegeExample>