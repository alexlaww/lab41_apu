/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2q1;

import java.util.Scanner;

public class Q8ArraySum {
    public static void main(String[] args) {
     
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int arraySize = input.nextInt();

        // Create an array with the user-specified size
        double[] values = new double[arraySize];

        // Prompt the user to enter the values
        System.out.println("Enter " + arraySize + " double values:");
        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            values[i] = input.nextDouble();
        }
        // Initialize a variable to store the sum
        double sum = 0.0;
        // Use a for-each loop to iterate through the array and sum the elements
        for (double element : values) {
            sum += element;
        }
        // Display the total sum
        System.out.println("The sum of all values in the array is: " + sum);
       }
}
