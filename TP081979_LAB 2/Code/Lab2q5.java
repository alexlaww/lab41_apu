/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Lab2q5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code(0-128): ");
        int asciiCode = input.nextInt();
        if (asciiCode >= 0 && asciiCode <= 128){
            char character = (char) asciiCode;
            System.out.println("The character for ASCII code " + asciiCode + " is: '" + character + "'");
        } else {
            System.out.println("Invalid input! Please enter a value between 0 and 128.");
        }

        input.close();
            
               
        
    }
    
}
