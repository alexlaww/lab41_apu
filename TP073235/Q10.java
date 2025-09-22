/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Program is running...");

            System.out.print("Do you want to continue? (Yes/No): ");
            choice = input.next();

        } while (choice.equalsIgnoreCase("Yes"));

        System.out.println("Program terminated.");
    }
}
