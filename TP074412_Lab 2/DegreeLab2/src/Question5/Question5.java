/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question5;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter an ASCII code (0 - 128): ");
        int code = input.nextInt();

        
        
        char character = (char) code;
        
        System.out.println(character);
    }
}
