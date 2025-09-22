package com.mycompany.mavenproject1;

import java.util.Scanner;

public class SumArrayValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[100];

        System.out.print("How many numbers do you want to add (1-100)? ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        double sum = 0;
        int index = 0;
        for (double value : numbers) {
            if (index >= count) {
                break;
            }
            sum += value;
            index++;
        }

        System.out.println("The sum of the numbers is " + sum + ".");

        scanner.close();
    }
}
