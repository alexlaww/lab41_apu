/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;


import java.util.Scanner;

public class Lab2q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Scanner included, even if not used

        double tuition = 10000;   // initial tuition fee
        double rate = 0.05;       // 5% increase per year

        for (int year = 1; year <= 10; year++) {
            System.out.println("Year " + year + ": RM" + String.format("%.2f", tuition));
            tuition += tuition * rate;  // increase by 5% for next year
        }

        System.out.println("The tuition fee after 10 years is: RM" + String.format("%.2f", tuition));

        input.close();
    }
}



