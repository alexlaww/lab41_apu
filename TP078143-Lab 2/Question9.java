import java.util.Scanner;
public class Question9 {
    public static void main(String[] args){
       /* LAB 2 QUESTION 9 */
       double fee = 10000;
       double rate = 0.05;
       
       for (int year = 1; year <= 10; year++){
           fee = fee + (rate * fee);
       }
       
       System.out.printf("The tuition after 10 years is RM%.2f", fee);
       
    }
    
}