/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

public class Lab2q8 {
    public static void main(String[] args) {
        // Create an array of size 100
        double[] numbers = new double[100];

        // Fill the array with some values (example: index value * 1.5)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 1.5;  
        }

        // Sum using for-each loop
        double sum = 0;
        for (double value : numbers) {
            sum += value;
        }

        // Display result
        System.out.println("The sum of all values in the array is: " + sum);
    }
}

