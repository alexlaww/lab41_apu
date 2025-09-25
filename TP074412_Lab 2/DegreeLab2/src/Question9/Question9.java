/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question9;

/**
 *
 * @author user
 */
public class Question9 {
    public static void main(String[] args) {
        double tuition = 10000; // starting tuition
        double rate = 0.05;     // 5% increase per year

        for (int year = 1; year <= 10; year++) {
            tuition += tuition * rate;
            System.out.printf("Year %d: RM%.2f%n", year, tuition);
    }
}
}
