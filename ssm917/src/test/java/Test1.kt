
import com.dingyun.dao.UserDao
import org.junit.Test
import org.springframework.context.support.ClassPathXmlApplicationContext

//@Controller
class Test1 {
//    @Autowired
//    internal var userDao: UserDao? = null

    @Test
    fun test1() {

//
//                val all = userDao!!.findAll()
//                System.out.println(all)


        val cfg = "Spring.xml"

        val applicationContext = ClassPathXmlApplicationContext(cfg)
        val userDao = applicationContext.getBean("userDao", UserDao::class.java) as UserDao
        val userList = userDao.findAll()
        println(userList.toString())

    }


}
