/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2q1;

import java.util.Scanner;

public class Q11Investment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter the investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter the annual interest rate (e.g., 5 for 5%): ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter the number of years: ");
        int numberOfYears = input.nextInt();

        // Convert annual rate to monthly rate and format
        double monthlyInterestRate = (annualInterestRate / 100) / 12;

        // Calculate the future investment value using the formula and Math.pow()
        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (numberOfYears * 12));

        // Display the result
        System.out.printf("The future investment value is: RM%.2f%n", futureInvestmentValue);
    }
}
