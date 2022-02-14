package com.project;

public class StudentReportCard {
    private int total_subjects;
    private int points_earned;
    private float gpa;
    private float cgpa;
    private Student student;

    public StudentReportCard(int studentID, String studentName, String departmentName, int semesterNo, int total_subjects, int points_earned) {
        student = new Student(studentID,studentName,departmentName,semesterNo);
        this.total_subjects = total_subjects;
        this.points_earned = points_earned;
    }
    public float gpaCalculator(){
        gpa = (float) (total_subjects*points_earned)/7;
        return gpa;
    }
    public float cgpaCalculator(float gpa){
        cgpa=gpa/student.getSemesterNo();
        return cgpa;
    }
    public void display(){
        student.display();
        System.out.println("GPA Computed: "+gpaCalculator());
        System.out.println("CGPA Computed: "+cgpaCalculator(gpa));
    }
}
