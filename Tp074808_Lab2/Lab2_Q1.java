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
public class Lab2_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fahrenteit: ");
        double f = sc.nextDouble();
 
        double c = (f -32) * 5 /9;
        
        System.out.println("The celsius is :" + c);
        sc.close();
    }
    
    
}
