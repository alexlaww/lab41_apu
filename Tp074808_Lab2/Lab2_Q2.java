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
public class Lab2_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter radius");
        double r = sc.nextDouble();
        System.out.println("enter length ");
        double l = sc.nextDouble();
        
        double area = (r * l);
        double volume = area * l;
        
        System.out.println("The area is :" + area);
        System.out.println("The volume is :" + volume);
    }
}
