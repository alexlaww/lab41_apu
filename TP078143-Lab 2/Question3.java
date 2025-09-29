import java.util.Scanner;
public class Question3 {
    public static void main(String[] args){
       /* LAB 2 QUESTION 3 */
       Scanner scanner = new Scanner(System.in); // to scan
       System.out.print("Enter number between 0 to 1000: "); //for example input 123
       int number = scanner.nextInt();
       
       // check if the number is within the valid range
       if (number < 0 || number > 1000){
           System.out.println("Please enter a number between 0 and 1000.");
       } else {
           int sum = 0;
           while (number > 0){ // 123 is more than 0
               sum += number % 10; // 123 % 10 is 3, 3 adds to sum variable
               number = number / 10; // 123 / 10 is 12 then loop again to check if 12 is more than 0
           }
            System.out.println("The sum of all digit is: " + sum);
           
       }
       
       scanner.close();
    }

}
