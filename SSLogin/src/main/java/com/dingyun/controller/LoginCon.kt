package com.dingyun.controller

import com.dingyun.dao.UserDao
import com.dingyun.modle.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
@RequestMapping("/User")
class LoginCon {


    @Autowired
    internal var userDao: UserDao? = null

    @RequestMapping("/userLogin")
    fun userLogin(user: User): ModelAndView {
        val mav = ModelAndView()
        val aBoolean = userDao!!.find(user)
        mav.viewName = if (aBoolean) "success" else "false"
        return mav
    }
}
