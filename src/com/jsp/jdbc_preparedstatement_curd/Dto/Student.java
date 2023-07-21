package com.jsp.jdbc_preparedstatement_curd.Dto;

public class Student
{
    private int studentid;
    private String studentname;
    private String studentemail;
    private long studentphone;

    public Student(int studentid, String studentname, String studentemail, long studentphone)
    {
        super();
        this.studentid=studentid;
        this.studentname=studentname;
        this.studentemail=studentemail;
        this.studentphone=studentphone;
    }

    public void setId(int studentid) {
        this.studentid = studentid;
    }

    public void setName(String studentname) {
        this.studentname = studentname;
    }

    public void setEmail(String studentemail) {
        this.studentemail = studentemail;
    }

    public void setPhone(long studentphone) {
        this.studentphone = studentphone;
    }

    public int getStudentid() {
        return studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public String getStudentemail() {
        return studentemail;
    }

    public long getStudentphone() {
        return studentphone;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}

