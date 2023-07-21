package com.jsp.jdbc_preparedstatement_curd.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentConnection
{
    public static Connection getStudentConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/jdbc_preparedstatement";
            String user="root";
            String pass="root";
            Connection connection = DriverManager.getConnection(url,user,pass);

            return connection;
        }
        catch (ClassNotFoundException |SQLException e)
        {
           e.printStackTrace();
        }
        return null;
    }
}
