package com.jsp.jdbc_preparedstatement_curd.Ins_Upd_Del_Dis;

import java.sql.*;

public class productDisplayController
    {
        public static void main(String[] args)
        {
            Connection connection = null;
            try
            {
                //Step-1 LOad/Register
                Class.forName("com.mysql.cj.jdbc.Driver");
//
                String url = "jdbc:mysql://localhost:3306/jdbc_preparedstatement";
                String user = "root";
                String pass = "root";

                connection = DriverManager.getConnection(url, user, pass);

                String displayQuery = "Select * from product";
//
                PreparedStatement preparedStatement = connection.prepareStatement(displayQuery);

                ResultSet rs=preparedStatement.executeQuery();

                while(rs.next())
                {
                    int productid = rs.getInt("productid");
                    String productname = rs.getString("productname");
                    double productprice = rs.getDouble("productprice");
                    String productcolor = rs.getString("productcolor");
                    System.out.println("ID : "+productid+ "\n"+"Name : "+productname+ "\n"+"price : "+productprice+ "\n"+"color :"+productcolor+"\n");
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            finally
            {
                try
                {
                    connection.close();
                }
                catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
