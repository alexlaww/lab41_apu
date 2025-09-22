/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class RadiusAndLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        System.out.print("Enter length: ");
        double length = input.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.println("The volume of the cylinder is " + volume);
    }
}
