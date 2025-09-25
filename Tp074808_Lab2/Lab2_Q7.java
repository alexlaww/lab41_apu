/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;
/**
 *
 * @author jun20
 */
public class Lab2_Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark here(0-100) :");
        double mark = sc.nextDouble();
        
       String grade = "";
       String description = "";
       
       if (mark >=0 && mark <=40)
       {
            grade = "F";
            description = "Fail";
       }
        else if (mark <=49)
        {
            grade = "F+";
            description = "Marginal Fail";
        }
        else if (mark <=54)
        {
            grade = "D";
            description = "Pass";
        }
        else if (mark <=64)
        {
            grade = "C";
            description = "Pass";
        }
        else if (mark <=69)
        {
            grade = "B";
            description = "Credir";
        }
        else if (mark <=74)
        {
            grade = "B+";
            description = "Credit";
        }
        else if (mark <=79)
        {
            grade = "A";
            description = "Distinction";
        }
        else if (mark <=100)
        {
            grade = "A+";
            description = "Distinction";
        }
        else {
        grade = "invalid number!!";
        description ="Please enter a number !!!";
        }  
       
        System.out.println("Your grade is : " + grade);
        System.out.println(description);
       
    }
}
