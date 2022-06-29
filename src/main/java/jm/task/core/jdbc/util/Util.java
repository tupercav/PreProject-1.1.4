package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    static String url = "jdbc:mysql://localhost:3306/mydbtest";
    static String username = "root";
    static String password = "root";
    public static Connection getConnection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }


    // реализуйте настройку соеденения с БД
}
