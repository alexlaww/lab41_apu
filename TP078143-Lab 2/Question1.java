import java.util.Scanner;
public class Question1 {
    public static void main(String[] args){
        /* LAB TWO QUESTION 1 */
        // create input 
        Scanner scanner = new Scanner(System.in);
        
        // prompt user to enter Fahrenheit temperature
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        // convert fahreinheit to celcius
        double celcius = (fahrenheit - 32) * 5 / 9;
        
        // display result
        System.out.println("The temperature in Celcius is: "+ celcius);
        
        // close the scanner
        scanner.close();
    }
    
}
