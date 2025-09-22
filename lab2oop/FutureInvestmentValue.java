package com.mycompany.mavenproject1;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate / 12 / 100;
        double months = years * 12;
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, months);

        System.out.println("Future investment value is " + futureInvestmentValue + ".");

        scanner.close();
    }
}
