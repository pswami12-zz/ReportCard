package com.project;

import java.util.Scanner;

public class Main {

    public static boolean validateInputs(int studentID,int semNumber,int total_subjects,int points_earned){
        boolean id=false;
        boolean semNum=false;
        boolean t_s=false;
        boolean p_e=false;

        int len=0;
        while(studentID>0){
            studentID=studentID/10;
            len++;
        }
        if(len==4){
            id=true;
        }

        if(semNumber>=1 && semNumber<=7){
            semNum=true;
        }

        if(total_subjects>=1 && total_subjects<=7){
            t_s=true;
        }

        if(points_earned>=1 && points_earned<=20){
            p_e=true;
        }

        if(id && semNum && t_s && p_e){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
	// write your code here
        int studentID;
        String studentName;
        String departmentName;
        int semesterNo;
        int total_subjects;
        int points_earned;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter StudentID");
        studentID=scanner.nextInt();
        scanner.nextLine(); // to prevent skipping student name after entering student id (otherwise student name takes \n as input after nextInt())
        System.out.println("Enter Student Name");
        studentName=scanner.nextLine();
        System.out.println("Enter Department Name");
        departmentName=scanner.nextLine();
        System.out.println("Enter Semester Number");
        semesterNo=scanner.nextInt();
        System.out.println("Enter Total Subjects");
        total_subjects=scanner.nextInt();
        System.out.println("Enter Points Earned");
        points_earned=scanner.nextInt();

        if(validateInputs(studentID,semesterNo,total_subjects,points_earned)){
            StudentReportCard reportCard = new StudentReportCard(studentID,studentName,departmentName,semesterNo,total_subjects,points_earned);
            reportCard.display();
        }
        else {
            System.out.println("Invalid Request");
        }
    }

}
