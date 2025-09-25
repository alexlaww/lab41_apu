/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author jun20
 */
public class LAb2_Q8 {
    public static void main(String[] args) {
         double[] numbers = new double[100];
        
        // Initialize array with some values (for demonstration)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1; // store 1.0, 2.0, 3.0, ...
        }

        // Variable to store sum
        double sum = 0;

        // Use for-each loop to sum up all values
        for (double value : numbers) {
            sum += value;
        }

        // Output the result
        System.out.println("The sum of all array values is: " + sum);
                
    }
}
