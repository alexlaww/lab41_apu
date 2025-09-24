/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2q1;

import java.util.Scanner;

public class Q7GradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt for the assignment marks
        System.out.print("Enter the assignment marks (0-100): ");
        double marks = input.nextDouble();

        // Use if-else if statements to determine the grade
        if (marks >= 80 && marks <= 100) {
            System.out.println("Grade: A+");
            System.out.println("Description: Distinction");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
            System.out.println("Description: Distinction");
        } else if (marks >= 70) {
            System.out.println("Grade: B+");
            System.out.println("Description: Credit");
        } else if (marks >= 65) {
            System.out.println("Grade: B");
            System.out.println("Description: Credit");
        } else if (marks >= 55) {
            System.out.println("Grade: C");
            System.out.println("Description: Pass");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
            System.out.println("Description: Pass");
        } else if (marks >= 40) {
            System.out.println("Grade: F+");
            System.out.println("Description: Marginal Fail");
        } else if (marks >= 0) {
            System.out.println("Grade: F");
            System.out.println("Description: Fail");
        } else {
            System.out.println("Invalid marks entered. Please enter a number between 0 and 100.");
        }
    }
}
