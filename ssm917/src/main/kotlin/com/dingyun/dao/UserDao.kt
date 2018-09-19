package com.dingyun.dao

import com.dingyun.entry.User
import org.springframework.stereotype.Repository

@Repository
interface UserDao {
    fun findAll(): List<User>


}
