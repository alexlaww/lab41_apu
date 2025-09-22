/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.print("Enter a temperature in Fahrenheit:");
        double fahrenheit = temp.nextDouble();
        double celsius = (fahrenheit-32) * 5.0/9.0;
        System.out.println( fahrenheit+ "degrees Fahrenheit is" + celsius + "degrees celsius.");
    }
}
