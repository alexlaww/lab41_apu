/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2q1;

import java.util.Scanner;

public class Q4CaseConvertor {
     public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an uppercase letter
        System.out.print("Enter an uppercase letter: ");
        String letter = input.next(); // Read the letter as a string

        // Convert the first character of the string to lowercase
        char lowercaseLetter = Character.toLowerCase(letter.charAt(0));

        // Display the result
        System.out.println("The lowercase letter is: " + lowercaseLetter);
     }
}
