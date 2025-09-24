/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2q1;

/**
 *
 * @author User
 */
public class Q9TuitionCalc {
    public static void main(String[] args) {
        double tuition = 10000.0; // Starting tuition
        double rate = 0.05;       // 5% increase rate

        System.out.println("Year 1: RM" + tuition);

        // Loop for the next 9 years (since Year 1 is the starting point)
        for (int i = 2; i <= 10; i++) {
            tuition = tuition + (tuition * rate); // Or simply tuition *= (1 + rate);
            System.out.printf("Year %d: RM%.2f%n", i, tuition);
        }
    }
}
