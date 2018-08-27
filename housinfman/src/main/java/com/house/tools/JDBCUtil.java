package com.house.tools;

import com.house.dao.RectDAO;
import com.house.dao.impl.RectDAOImpl;
import com.house.pojo.Rect;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 * @author DinGYun
 * 使用反射实现了mybatis的一些部分，让我们的代码更简洁：
 * 主要实现了查到数据库的数据自动封装到
 */
public class JDBCUtil {
    public static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    public static final String ROOT = "root";
    public static final String PASSWORD = "root";
    public static final String DB_NAME = "housinfman";
    public static final String URL = "jdbc:mysql://127.0.0.1:3306/" + DB_NAME;

    private static ComboPooledDataSource dataSource = null;

    private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();

    static {
        dataSource = new ComboPooledDataSource();
    }

    public static DataSource getDataSource(){
        return dataSource;
    }

    public static Connection getConnection(){
        Connection conn = tl.get();
        try {
            if(conn == null){
                conn = dataSource.getConnection();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        tl.set(conn);
        return conn;
    }

    public static <E> List<E> dbDQLWithSQL(String sql, Class<E> class1, Object... objects) {
        Connection connection = getConnection();
        System.out.println("链接数据库成功");
        PreparedStatement ps = null;
        List<E> list = new ArrayList();
        ResultSet set = null;
        try {
            ps = connection.prepareStatement(sql);
            for (int i = 1; i <= objects.length; i++) {
                Object o = objects[i - 1];
                ps.setObject(i, o);
            }
//            获取数据库列名中放到names中
            ResultSetMetaData data = ps.getMetaData();
            String[] names = new String[data.getColumnCount()];
            for (int i = 1; i <= data.getColumnCount(); i++) {
                String name = data.getColumnLabel(i);
                names[i - 1] = name;
            }
            set = ps.executeQuery();
            while (set.next()) {
                E oE = class1.newInstance();
                for (String name : names) {
                    Object value = set.getObject(name);
//                    可以自己定义不同的翻译类来匹配不同的字符串
                    name = UrlStitching.columnTransform(name);
//                    注意这里是得到名字为数据库列名的field对象
//                    可能名字不一样,但是相关
//                    我们可以对字符串进行处理
                    Field field = class1.getDeclaredField(name);
                    field.setAccessible(true);
                    field.set(oE, value);
                }
                list.add(oE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            close(connection, ps, set);
        }
        return list;
    }

//    public static Connection getConnection() {
//        Connection connection = null;
//        try {
//            Class.forName(DRIVER_NAME);
//            connection = DriverManager.getConnection(URL, ROOT, PASSWORD);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return connection;
//    }


    public static boolean daDMLWithSQL(String sql, Object... objects) {
        Connection connection = getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            for (int i = 0; i < objects.length; i++) {
                ps.setObject(i + 1, objects[i]);
            }
            ps.execute();

            close(connection, ps);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void close(PreparedStatement ps) {
        try {
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection connection) {
        try {
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void close(ResultSet set) {
        try {
            set.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void close(Connection connection, PreparedStatement ps) {
        close(ps);
        close(connection);

    }

    public static void close(Connection connection, PreparedStatement ps, ResultSet set) {
        close(set);
        close(connection, ps);

    }

    public static void main(String[] args) {

        RectDAO rectDAO = new RectDAOImpl();

        List<Rect> rects = rectDAO.searchAll();
        System.out.println(rects);
    }

}
