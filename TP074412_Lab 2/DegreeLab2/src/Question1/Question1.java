
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Question1 {
    
    public static void main(String[] args) {
        double c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Farhet");
        double f = sc.nextDouble();
        c = (f - 32) * 5/9;
        System.out.println(c);
    }
    
   
}