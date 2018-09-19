package com.lsg;

import com.lsg.dao.UserDAO;
import com.lsg.model.User;
import com.lsg.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Controller
public class UserController {
    @Autowired
    UserDAO userDao;

    @RequestMapping("/user/userlogin")
    @ResponseBody
    public List<User> userlogin() {
        UserExample userExample = new UserExample();
        userExample.createCriteria();
        List<User> users = userDao.selectByExample(userExample);
        System.out.println("sss");
        return users;

    }
    @RequestMapping("userAuthentication.do")
    @ResponseBody
    public String userAuthentication(String username, String password, HttpServletResponse res){
        return username.equals("222") ? "用户名被占用" : "可以使用";
    }


}
