@JDBCUtil(ip = "127.0.0.1", database = "test", encoding = "UTF-8", loginName = "root", password = "admin")
public class DBUtil {

    //    static {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
    public static void main(String[] args) {
        JDBCUtil annotation = DBUtil.class.getAnnotation(JDBCUtil.class);
        String database = annotation.database();
        String loginName = annotation.loginName();
        String password = annotation.password();
        int port = annotation.port();
        int a = 1 / 0;

        System.out.printf("%S\n%S\n%S\n%S\n", database, loginName, password, port);
    }

}
