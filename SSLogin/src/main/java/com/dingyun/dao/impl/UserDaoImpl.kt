package com.dingyun.dao.impl

import com.dingyun.dao.UserDao
import com.dingyun.modle.User
import org.apache.tomcat.dbcp.dbcp.BasicDataSource
import org.springframework.context.support.ClassPathXmlApplicationContext
import org.springframework.stereotype.Service
import java.sql.SQLException
import javax.annotation.Resource

@Service
class UserDaoImpl : UserDao {

    @Resource
    private var bs: BasicDataSource? = null

    internal var cfg = "Spring.xml"


    override fun find(user: User): Boolean {
        try {
            val ac = ClassPathXmlApplicationContext(cfg)
            bs = ac.getBean("ds") as BasicDataSource
            val conn = bs!!.connection
            val sql = "select * from user where u_username=? and U_password=?"
            val ps = conn.prepareStatement(sql)
            ps.setString(1, user.name)
            ps.setString(2, user.password)
            val rs = ps.executeQuery()
            System.out.printf("aa")
            return if (rs.next()) true else false
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return false
    }
}
