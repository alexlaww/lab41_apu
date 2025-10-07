
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter radius of cylinder: ");
    String radius = scan.nextLine();
    System.out.print("Enter height of cylinder: ");
    String height = scan.nextLine();
    double pi = 3.14159;
    double volume = Double.parseDouble(radius)*Double.parseDouble(radius)*pi*Double.parseDouble(height);
    System.out.println("Volume of cylinder with given dimensions is: " + volume);
  }
}
