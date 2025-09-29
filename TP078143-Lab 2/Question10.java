import java.util.Scanner;
public class Question10 {
    public static void main(String[] args){
       /* LAB 2 QUESTION 10 */
       Scanner scanner = new Scanner(System.in);
       String input;
       
       do{
          System.out.print("Hi! Do you want to continue the program execution? (Yes/No):");
          input = scanner.nextLine(); // read user input
       } while (input.equalsIgnoreCase("Yes")); // makes comparison case sensitive "yes", "YES", "Yes" will work
       
       System.out.println("Program terminated");
       scanner.close();
       
    }
    
}