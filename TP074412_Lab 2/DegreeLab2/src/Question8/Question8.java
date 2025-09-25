/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question8;
/**
 *
 * @author user
 */
public class Question8 {
    public static void main(String[] args) {
        double[] numbers = new double[100];
        double sum = 0;

        // Fill array with sample values (1.0, 2.0, 3.0, ...)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // Use enhanced for-loop (for-each)
        for (double num : numbers) {
            sum += num;
        }

        System.out.println("The sum of array values = " + sum);
    }
}
