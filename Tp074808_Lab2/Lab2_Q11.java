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
public class Lab2_Q11 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter investment amount (e.g., 10000): ");
        double investmentAmount = sc.nextDouble();

        System.out.print("Enter annual interest rate in % (e.g., 5 for 5%): ");
        double annualInterestRate = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int numberOfYears = sc.nextInt();

        // Convert annual rate to monthly rate (decimal form)
        double monthlyInterestRate = annualInterestRate / 1200; // e.g., 5% → 0.004166...

        // Compute future investment value
        double futureInvestmentValue = investmentAmount *
                Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

        // Display result
        System.out.printf("Future investment value is: RM%.2f\n", futureInvestmentValue);

        sc.close();
    }
}
