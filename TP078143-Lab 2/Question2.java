import java.util.Scanner;
public class Question2 {
    public static void main(String[] args){
        /* LAB TWO QUESTION 2 */
        // create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // define the constant PI
        final double PI = 3.14159;
        
        // prompt the user to enter radius and length of cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        
        System.out.print("Enter the length of the cyliinder: ");
        double length = scanner.nextDouble();
        
        // calculate the area of the base
        double area = radius * radius * PI;
        
        // calculate the volume of the cylinder
        double volume = area * length;
        
        // display the result
        System.out.println("The volume of the cylinder is: "+ volume);
        
        // close the scanner
        scanner.close();
    }
    
}
