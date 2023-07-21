package com.jsp.jdbc_preparedstatement_curd.Ins_Upd_Del_Dis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertQuery
{

    public static void main(String[] args)
    {
        Connection connection=null;
        try
        {
            //Step-1 LOad/Register
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/jdbc_preparedstatement";
            String user="root";
            String pass="root";

            connection= DriverManager.getConnection(url,user,pass);

            String InsertColorQuery="insert into product values (?,?,?,?)";

            PreparedStatement preparedStatement= connection.prepareStatement(InsertColorQuery);

            preparedStatement.setInt(1,103);
            preparedStatement.setString(2,"pencil");
            preparedStatement.setDouble(3,50);
            preparedStatement.setString(4,"brown");

            preparedStatement.execute();

            System.out.println("Data Stored.....");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
