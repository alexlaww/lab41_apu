/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author jun20
 */
public class Lab2_Q9 {
        public static void main(String[] args) {
        double tuition = 10000;  
        double rate = 0.05;       

        for (int year = 1; year <= 10; year++) {
            tuition = tuition + (tuition * rate);
            System.out.println("Year " + year + " tuition: RM" + tuition);
        }
    }
}
