package com.mycompany.mavenproject1;

public class TuitionIncrease {
    public static void main(String[] args) {
        double tuition = 10000.0;
        double rate = 0.05;

        for (int year = 1; year <= 10; year++) {
            tuition = tuition * (1 + rate);
        }

        System.out.println("Tuition in ten years will be " + tuition + ".");
    }
}
