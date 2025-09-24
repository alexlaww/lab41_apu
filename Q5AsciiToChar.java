/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2q1;

import java.util.Scanner;

public class Q5AsciiToChar {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for an ASCII code
        System.out.print("Enter an ASCII code (an integer between 0 and 128): ");
        int asciiCode = input.nextInt();

        // Cast the integer to a char
        char character = (char) asciiCode;

        // Display the result
        System.out.println("The character for ASCII code " + asciiCode + " is " + character);
    }
}
