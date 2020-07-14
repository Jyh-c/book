package com.jmp.util;

import java.sql.*;
import java.util.ResourceBundle;

/**
 * @author JYH
 * @version 1.0
 * @date 2020/6/19 23:53
 */
public class DBUtil {

    //数据库连接地址
    private static final String URL;
    //数据库用户名
    private static final String USERNAME;
    //数据库密码
    private static final String PASSWORD;
    //加载数据库连接驱动程序
    private static final String DRIVER;

    private DBUtil(){}

    //加载数据库配置文件
    private static ResourceBundle rb = ResourceBundle.getBundle("com.jmp.util.db-config");

    //加载数据库配置文件中的连接信息
    static{
        URL = rb.getString("jdbc.url");
        USERNAME = rb.getString("jdbc.username");
        PASSWORD = rb.getString("jdbc.password");
        DRIVER = rb.getString("jdbc.driver");
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //创建数据库连接
    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
//            System.out.println("数据库连接成功。");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("数据库连接失败，请检查数据库地址、用户名、密码是否存在错误！！！");
        }
        return con;
    }

    //关闭数据库连接
    public static void close(ResultSet rs, Statement stat,Connection con) throws SQLException {
        if(rs != null){
            rs.close();
        }if(stat != null){
            rs.close();
        }if(con != null){
            rs.close();
        }
        System.out.println("数据库连接已关闭！");
    }

    //测试数据库连接
    public static void main(String[] args) {
        System.out.println(DBUtil.getConnection());
    }
}
