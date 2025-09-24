/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2q1;

import java.util.Scanner;

public class Q10ContinueLoop {
     public static void main(String[] args) {
        Scanner cont = new Scanner(System.in);
        String choice;

        do {
            // Your program logic would go here.
            System.out.println("Program is running...");

            // Prompt the user to continue or terminate
            System.out.print("Do you want to continue the program? (Yes/No): ");
            choice = cont.next();

        } while (choice.equalsIgnoreCase("Yes"));

        System.out.println("Program terminated.");
        cont.close();
    }
}
