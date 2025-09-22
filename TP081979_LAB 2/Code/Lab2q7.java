package com.mycompany.mavenproject1;
import java.util.Scanner;
public class Lab2q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter assignment marks (0 - 100): ");
        int marks = input.nextInt();
        String grade;
        String description;
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter between 0 and 100.");
            input.close();
            return;
        }
        if (marks <= 40) {
            grade = "F";
            description = "Fail";
        } else if (marks <= 49) {
            grade = "F+";
            description = "Marginal Fail";
        } else if (marks <= 54) {
            grade = "D";
            description = "Pass";
        } else if (marks <= 64) {
            grade = "C";
            description = "";
        } else if (marks <= 69) {
            grade = "B";
            description = "Credit";
        } else if (marks <= 74) {
            grade = "B+";
            description = "";
        } else if (marks <= 79) {
            grade = "A";
            description = "Distinction";
        } else {
            grade = "A+";
            description = "";
        }
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        if (!description.isEmpty()) {
            System.out.println("Description: " + description);
        }
        input.close();
    }
}

