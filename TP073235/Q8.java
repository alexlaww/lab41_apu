/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2;

/**
 *
 * @author USER
 */
public class Q8 {
    public static void main(String[] args) {
        double[] numbers = new double[100];

        // Fill with some values (example)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1; 
        }

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        System.out.println("Sum of array values: " + sum);
    }
}
