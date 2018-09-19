package com.dingyun.dao

import com.dingyun.modle.User

interface UserDao {

    fun find(user: User): Boolean
}
