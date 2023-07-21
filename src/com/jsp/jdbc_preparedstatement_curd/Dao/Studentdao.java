package com.jsp.jdbc_preparedstatement_curd.Dao;

import com.jsp.jdbc_preparedstatement_curd.Connection.StudentConnection;
import com.jsp.jdbc_preparedstatement_curd.Dto.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Studentdao
{
//    insert method for student
    Connection connection=StudentConnection.getStudentConnection();

    public Student insertStudent(Student student)
    {
        System.out.println("insertdao Method Started !!!");
        String insertQuery="insert into student values(?,?,?,?)";
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            preparedStatement.setInt(1,student.getStudentid());
            preparedStatement.setString(2, student.getStudentname());
            preparedStatement.setString(3, student.getStudentemail());
            preparedStatement.setLong(4,student.getStudentphone());

            preparedStatement.execute();
            System.out.println("insertdao Method Ended !!!");
            System.out.println("data Stored ....!!!");


            return student;

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return  null;
    }
    public int updateStudentName(int studentid,String studentname)
    {
        String updateStudentNameQuery = "update student set name=? where id=?";

        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement(updateStudentNameQuery);

            return preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
