import java.util.Scanner;
public class Question5 {
    public static void main(String[] args){
       /* LAB 2 QUESTION 5 */
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter an ASCII code (0 to 128): ");
       int code = scanner.nextInt();

       // Check if code is in valid ASCII range
       if (code >= 0 && code <= 128) {
           char character = (char) code; // Convert integer to character
           System.out.println("The character for ASCII code " + code + " is: " + character);
       } else {
           System.out.println("Invalid input! Please enter a number between 0 and 128.");
       }

       scanner.close();
       
    }
    
}
