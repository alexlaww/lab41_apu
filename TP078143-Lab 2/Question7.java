import java.util.Scanner;
public class Question7 {
    public static void main(String[] args){
       /* LAB 2 QUESTION 7 */
       Scanner scanner = new Scanner(System.in);
       
       // takes input from user
       System.out.print("Enter Assignment Marks: ");
       int marks = scanner.nextInt();
       
       String grade="0",desc="0";
       if (marks < 0 || marks > 100){
           System.out.println("Invalid marks");
       } else {
           if (marks >= 0 && marks <= 40){
               grade = "F";
               desc = "Fail";
           } else if (marks >= 40 && marks <= 49){
               grade = "F+";
               desc = "Marginal Fail";
           } else if (marks >= 50 && marks <= 54){
               grade = "D";
               desc = "Pass";
           } else if (marks >= 55 && marks <= 64){
               grade = "C";
               desc = "Pass";
           } else if (marks >= 65 && marks <= 69){
               grade = "B";
               desc = "Credit";
           } else if (marks >= 70 && marks <= 74){
               grade = "B+";
               desc = "Credit";
           } else if (marks >= 75 && marks <= 79){
               grade = "A";
               desc = "Distinction";
           } else if (marks >= 80 && marks <= 100){
               grade = "A+";
               desc = "Distinction";
           }
       }
       System.out.println("Grade: " + grade);
       System.out.println("Description: " + desc);
       scanner.close();
            
       
       
    }
    
}