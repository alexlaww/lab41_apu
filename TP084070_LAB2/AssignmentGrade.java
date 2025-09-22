package com.mycompany.mavenproject1;

import java.util.Scanner;

public class AssignmentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the assignment marks (0-100): ");
        int marks = scanner.nextInt();

        String grade;
        String description;

        if (marks < 0 || marks > 100) {
            grade = "Invalid";
            description = "Marks must be between 0 and 100.";
        } else if (marks < 40) {
            grade = "F";
            description = "Fail";
        } else if (marks < 50) {
            grade = "F+";
            description = "Marginal Fail";
        } else if (marks < 55) {
            grade = "D";
            description = "Pass";
        } else if (marks < 65) {
            grade = "C";
            description = "Pass";
        } else if (marks < 70) {
            grade = "B";
            description = "Credit";
        } else if (marks < 75) {
            grade = "B+";
            description = "Credit";
        } else if (marks < 80) {
            grade = "A";
            description = "Distinction";
        } else {
            grade = "A+";
            description = "Distinction";
        }

        System.out.println("Grade: " + grade);
        System.out.println("Description: " + description);

        scanner.close();
    }
}
