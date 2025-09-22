/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Lab2q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;

        do {
            // Program logic (you can put any code here, for demo we just show a message)
            System.out.println("Program is running...");

            // Ask user whether to continue
            System.out.print("Do you want to continue? (Yes/No): ");
            choice = input.next();

        } while (choice.equalsIgnoreCase("Yes"));

        System.out.println("Program terminated.");
        input.close();
    }
}

