package com.jsp.jdbc_preparedstatement_curd.service;
import com.jsp.jdbc_preparedstatement_curd.Dto.Student;

import com.jsp.jdbc_preparedstatement_curd.Dao.Studentdao;

public class StudentService
{
    Studentdao studentdao=new Studentdao();

    public Student insertStudentService(Student student)
    {
        System.out.println("InsertService Method Started !!!");
        if (student.getStudentid() <= 9999)
        {
            Student student2 = studentdao.insertStudent(student);
            System.out.println("InsertService Method Ended !!!");
            return student2;
        }
        else
        {
            System.err.println("Please Insert less than 4 Digit student_id ???..... ");
        }
        return null;
    }
}
