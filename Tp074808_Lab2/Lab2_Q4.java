/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author jun20
 */
public class Lab2_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for an uppercase letter
        System.out.print("Enter an uppercase letter: ");
        char uppercase = sc.next().charAt(0);

        // Convert to lowercase using Character.toLowerCase()
        char lowercase = Character.toLowerCase(uppercase);

        // Display result
        System.out.println("Lowercase letter: " + lowercase);

        sc.close();
    }
}
