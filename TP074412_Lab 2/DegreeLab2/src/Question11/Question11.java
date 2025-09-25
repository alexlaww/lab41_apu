/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question11;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate (e.g., 5 for 5%): ");
        double annualRate = input.nextDouble();
        double monthlyRate = annualRate / 1200; // convert % to decimal

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        
        double futureInvestmentVal = investmentAmount *
                Math.pow(1 + monthlyRate, years * 12);

        
        System.out.printf("Future investment value: RM%.2f%n", futureInvestmentVal);

 
    }    
}
