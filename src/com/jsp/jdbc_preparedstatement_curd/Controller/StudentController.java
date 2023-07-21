package com.jsp.jdbc_preparedstatement_curd.Controller;

import com.jsp.jdbc_preparedstatement_curd.Dao.Studentdao;
import com.jsp.jdbc_preparedstatement_curd.Dto.Student;
import com.jsp.jdbc_preparedstatement_curd.service.StudentService;

import java.util.Scanner;

public class StudentController
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Main Method Started !!!");

        Student student=null;
        StudentService studentService=new StudentService();
        System.out.println("Main Method Ended !!!");

        System.out.println("1.Insert\n 2.Update ");
        System.out.println("Enter your Option");
        int ch=scanner.nextInt();
        switch (ch)
        {
            case 1:
            {
                System.out.println("Enter student Id");
                int id=scanner.nextInt();
                System.out.println("Enter student Name");
                String name=scanner.nextLine();
                System.out.println("Enter student Email");
                String email=scanner.nextLine();
                System.out.println("Enter student Phone");
                Long phone=scanner.nextLong();

                Student =new Student(id,name,email,phone);
                StudentService.insertStudentService(Student);
                break;
            }
            case 2:
            {
                System.out.println("Enter Student Id");
                int id=scanner.nextInt();
                System.out.println("Enter Student Name");
                String name=scanner.next();

                int id1=studentService.updateStudentNameQuery(id,name);

                if (id1=1)
                {
                    System.out.println("Data ------- updated");
                }
                else
                {
                    System.out.println("id not found please check once");
                }
                break;
            }

        }

        Student student=new Student(100,"Amit Yadav","amyrao42021@gmail.com",946607604);
//        Student student2=new Student(101,"Ashish Yadav","ashishtyadav42021@gmail.com",999999999);

        Studentdao studentdao=new Studentdao();
        studentdao.insertStudent(student);
//        studentdao.insertStudent(student2);
        System.out.println("Data is Stored.... .");


        studentService.insertStudentService(student);

    }
}
