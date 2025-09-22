package com.mycompany.mavenproject1;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000: ");
        int number = scanner.nextInt();

        int value = number;
        int sum = 0;

        while (value > 0) {
            sum += value % 10;
            value /= 10;
        }

        System.out.println("The sum of the digits in " + number + " is " + sum + ".");

        scanner.close();
    }
}
