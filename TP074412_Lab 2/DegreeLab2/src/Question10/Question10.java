/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question10;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Program is running...");
            
            System.out.print("Do you want to continue? (Yes/No): ");
            choice = input.next();

        } while (choice.equalsIgnoreCase("Yes"));

        System.out.println("Program terminated.");
        input.close();
    }   
}
