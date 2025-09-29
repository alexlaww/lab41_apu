import java.util.Scanner;
public class Question8 {
    public static void main(String[] args){
       /* LAB 2 QUESTION 8 */
       double[] num = new double[100]; // create array that hold 100 values
       double sum = 0;
       for (int i = 0; i < num.length; i++){ 
           num[i] = i + 1;
           sum += num[i];
           
       }
       //alternative way
       //double sum = 0;
       //for (double value : num){ // take each element in num and put in variable value
       //    sum += value;
       //}       
       System.out.println("The sum of all array values: " + sum);       
    }   
}