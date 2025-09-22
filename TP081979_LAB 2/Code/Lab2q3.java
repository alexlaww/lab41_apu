/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Lab2q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 1000:" );
        int number = input.nextInt();
        if (number < 0 || number > 1000){
            System.out.println("Please enter a number between 0 and 1000");
        
        }else {
            int sum = 0;
            while (number > 0){
                sum += number % 10; 
                number = number / 10;
            }
            System.out.println("The sum of the digits is: " + sum);
            
        }
        input.close();
        
    }
    
}
