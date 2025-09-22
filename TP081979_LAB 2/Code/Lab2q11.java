/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Lab2q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read inputs
        System.out.print("Enter investment amount: RM");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate (e.g., 6 for 6%): ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        // Convert annual rate to monthly rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Compute future investment value
        double futureInvestmentVal = investmentAmount *
                Math.pow(1 + monthlyInterestRate, years * 12);

        // Display result
        System.out.println("Future investment value is: RM" + String.format("%.2f", futureInvestmentVal));

        input.close();
    }
}

