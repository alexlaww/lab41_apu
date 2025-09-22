/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Lab2q4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a lowercase letter or word: ");
        String userInput = input.next();

        // Convert to uppercase
        String upperCaseInput = userInput.toUpperCase();

        System.out.println("The uppercase equivalent is: " + upperCaseInput);

        input.close();
    }
}
    
    

