/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter assignment marks (0–100): ");
        int marks = input.nextInt();

        String grade, desc;

        if (marks >= 80) { grade = "A+"; desc = "Excellent"; }
        else if (marks >= 75) { grade = "A"; desc = "Distinction"; }
        else if (marks >= 70) { grade = "B+"; desc = "Credit"; }
        else if (marks >= 65) { grade = "B"; desc = "Credit"; }
        else if (marks >= 55) { grade = "C"; desc = "Pass"; }
        else if (marks >= 50) { grade = "D"; desc = "Pass"; }
        else if (marks >= 40) { grade = "F+"; desc = "Marginal Fail"; }
        else { grade = "F"; desc = "Fail"; }

        System.out.println("Grade: " + grade + " (" + desc + ")");
    }
}
