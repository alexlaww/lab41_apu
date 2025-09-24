/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2q1;

import java.util.Scanner;

public class Q1TemperatureConvertor {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner temp = new Scanner(System.in);
        
         // Prompt the user for a Fahrenheit temperature
        System.out.print("Enter a temperature in Fahrenheit: ");
        double fahrenheit = temp.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        // Note: Using 5.0 / 9.0 ensures floating-point division

        // Display the result
        System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius.");
    }
}
