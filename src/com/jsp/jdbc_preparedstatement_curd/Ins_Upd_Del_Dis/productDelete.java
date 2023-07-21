package com.jsp.jdbc_preparedstatement_curd.Ins_Upd_Del_Dis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class productDelete
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

            String deleteQuery="delete from product where productid=?";

            PreparedStatement preparedStatement= connection.prepareStatement(deleteQuery);

            preparedStatement.setInt(1,101);

            int a=preparedStatement.executeUpdate();

            if (a==1)
            {
                System.out.println("Data is Deleted");
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
        finally {
            try{
                connection.close();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }
}
