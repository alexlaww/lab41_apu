/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question7;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Question7 {
    public static void main(String[] args) {
               Scanner input = new Scanner(System.in);

        // Prompt user for marks
        System.out.print("Enter assignment marks (0 - 100): ");
        int marks = input.nextInt();

        String grade = "";
        String description = "";

        if (marks >= 0 && marks <= 40) {
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
            description = "Pass";
        } else if (marks <= 69) {
            grade = "B";
            description = "Credit";
        } else if (marks <= 74) {
            grade = "B+";
            description = "Credit";
        } else if (marks <= 79) {
            grade = "A";
            description = "Distinction";
        } else if (marks <= 100) {
            grade = "A+";
            description = "Distinction";
        }

        // Output result
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("Description: " + description);
    }
}
