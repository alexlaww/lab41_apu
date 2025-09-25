/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question6;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Question6 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        System.out.println("Input Month");
        int m = ms.nextInt();
        
        Scanner ys = new Scanner(System.in);
        System.out.println("Input Year");
        int y = ys.nextInt();
        
        int days = 0;
        
        switch(m){
            case 1: days = 31;
            case 2: if(y % 4 != 0){
                    days = 28;
                }else {days = 29;}
            break;
            case 3: days =31;
            case 4: days =30;
            case 5: days =31;
            case 6: days =30;
            case 7: days =31;
            case 8: days =31;
            case 9: days =30;
            case 10: days =31;
            case 11: days =30;
            case 12: days =31;
            
        } 
        
        System.out.println(days);
    }
}
