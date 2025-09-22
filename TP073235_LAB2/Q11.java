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
public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investment = input.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double annualRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double monthlyRate = annualRate / 1200; // % to decimal
        double futureValue = investment * Math.pow(1 + monthlyRate, years * 12);

        System.out.printf("Future investment value is RM%.2f%n", futureValue);
    }
}
