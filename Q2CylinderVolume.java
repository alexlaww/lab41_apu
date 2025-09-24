/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2q1;

import java.util.Scanner;

public class Q2CylinderVolume {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt for the radius and read the value
        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();

        // Prompt for the length and read the value
        System.out.print("Enter the length of the cylinder: ");
        double length = input.nextDouble();

        // Calculate the base area
        double area = radius * radius * Math.PI;

        // Calculate the volume using the area
        double volume = area * length;

        // Display the results
        System.out.println("The area of the cylinder's base is: " + area);
        System.out.println("The volume of the cylinder is: " + volume);
    }
}
