/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = d.nextInt();
        

        int sum = 0;
        while(n != 0){
            sum += n%10;
            n /= 10;
        }
        
        System.out.println(sum);
    }
}
