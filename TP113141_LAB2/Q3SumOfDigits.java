/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2q1;

import java.util.Scanner;

public class Q3SumOfDigits {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt for a number between 0 and 1000
        System.out.print("Enter an integer between 0 and 1000: ");
        int number = input.nextInt();

        // Extract the digits
        int firstDigit = number / 100;
        int remainingNumber = number % 100;
        int secondDigit = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;

        // Calculate the sum
        int sum = firstDigit + secondDigit + thirdDigit;

        // Display the sum of the digits
        System.out.println("The sum of the digits is " + sum);
    }
}
