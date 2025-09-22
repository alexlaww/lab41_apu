package com.mycompany.mavenproject1;

import java.util.Scanner;

public class UpperToLower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an uppercase letter: ");
        String inputText = scanner.nextLine();

        char uppercaseLetter = inputText.charAt(0);
        char lowercaseLetter = Character.toLowerCase(uppercaseLetter);

        System.out.println("The lowercase letter is " + lowercaseLetter + ".");

        scanner.close();
    }
}
