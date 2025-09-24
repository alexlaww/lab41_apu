/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2q1;

import java.util.Scanner;

public class Q6DaysInMonth {
     public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt for the month and year
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        // A boolean to check for leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Use a switch statement to determine the number of days
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month has 31 days.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month has 30 days.");
                break;
            case 2:
                if (isLeapYear) {
                    System.out.println("This month has 29 days.");
                } else {
                    System.out.println("This month has 28 days.");
                }
                break;
            default:
                System.out.println("Invalid month entered.");
        }
     }
}
