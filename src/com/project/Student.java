package com.project;

public class Student {
    private int studentID;
    private String studentName;
    private String departmentName;
    private int semesterNo;

    public Student(int studentID, String studentName, String departmentName, int semesterNo) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.departmentName = departmentName;
        this.semesterNo = semesterNo;
    }
    public void display(){
        System.out.println("Student ID: "+studentID);
        System.out.println("Name of the student: "+studentName);
        System.out.println("Department Name: "+departmentName);
        System.out.println("Semester Number: "+semesterNo);
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public int getSemesterNo() {
        return semesterNo;
    }
}
