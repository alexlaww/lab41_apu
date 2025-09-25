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
public class Lab2_Q10 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            // Example: Your program logic goes here
            System.out.println("Program is running...");

            // Ask user if they want to continue
            System.out.print("Do you want to continue? (Yes/No): ");
            choice = sc.nextLine().trim(); // read input and trim spaces

        } while (choice.equalsIgnoreCase("Yes"));

        System.out.println("Program terminated.");
        sc.close();
    }
}
