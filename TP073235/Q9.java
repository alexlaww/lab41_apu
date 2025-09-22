/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2;

/**
 *
 * @author USER
 */
public class Q9 {
    public static void main(String[] args) {
        double tuition = 10000;
        double rate = 0.05;

        for (int year = 1; year <= 10; year++) {
            tuition = tuition * (1 + rate);
        }

        System.out.printf("Tuition after 10 years: RM%.2f%n", tuition);
    }
}
