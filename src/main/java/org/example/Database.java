package org.example;

import java.sql.*;

public class Database {

    static private Connection conn;

    static {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Database(){}
    public static Connection getConnection() {
        return conn;
    }

}
