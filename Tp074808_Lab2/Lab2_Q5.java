package javaapplication1;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jun20
 */
public class Lab2_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter an ASCII code (0 - 128): ");
        int code = sc.nextInt();

       
        if (code >= 0 && code <= 128) {
            char character = (char) code; 
            System.out.println("The character for ASCII code " + code + " is: '" + character + "'");
        } else {
            System.out.println("Invalid input! Please enter a number between 0 and 128.");
        }

        sc.close();
    }
}

