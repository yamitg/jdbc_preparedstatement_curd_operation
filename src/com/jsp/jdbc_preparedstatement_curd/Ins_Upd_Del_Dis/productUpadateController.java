package com.jsp.jdbc_preparedstatement_curd.Ins_Upd_Del_Dis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class productUpadateController
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

            String updateColorQuery="update product set productcolor =? where productid=?";

            PreparedStatement preparedStatement= connection.prepareStatement(updateColorQuery);

            preparedStatement.setString(1,"White");
            preparedStatement.setInt(2,101);

            int a=preparedStatement.executeUpdate();

            if (a==1)
            {
                System.out.println("Data is Updated");
            }
            else
            {
                System.err.println("Given ID is not Present");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
