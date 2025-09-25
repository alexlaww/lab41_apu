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
public class Lab2_Q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        
        if (num < 0 || num > 1000)
        {
            System.out.println("Invalid input");
        }else{
        int sum =0;
        int ori =num;
        
            while (num != 0)
            {
                int digit = num % 10;
                sum += digit;
                num = num / 10;
            }
            System.out.println("The sum of the digit is :" + ori + "is" + sum);
        }
    }
}
