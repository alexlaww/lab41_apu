
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter investment amount: ");
    double investment = Double.parseDouble(scan.nextLine());
    System.out.println("Enter interest rate (%): ");
    double interest = 1 + Double.parseDouble(scan.nextLine())/100;
    System.out.println("Enter number of years: ");
    int years = Double.parseDouble(scan.nextLine());
    for (i = 0; i<years;i++) {
      investment = investment * interest
    }
    System.out.println("Your future investment value is: " + investment)
  }
}
