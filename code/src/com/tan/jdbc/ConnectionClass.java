package com.tan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {
    public static void main(String[] args) throws Exception {
        //1.加载驱动
        //把com.mysql.jdbc.Driver这份字节码加载进JVM
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接对象
        //url 数据库地址
        String url = "jdbc:mysql://localhost:3306/test";
        //用户名
        String user = "root";
        //密码
        String password = "1234";
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println(conn);
    }
}
