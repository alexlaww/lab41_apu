/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        System.out.println("Enter radius");
        double r = rs.nextDouble();
        
        Scanner ls = new Scanner(System.in);
        System.out.println("Enter length");
        double l = ls.nextDouble();
        
        double a = r * r * 3.14;
        double v = a * l;
        
        System.out.println("Area and Volume are:");
        System.out.println(a);
        System.out.println(v);

    }
}
