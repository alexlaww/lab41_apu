
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter ASCII code (integer between 0 and 128): ");
    int ascii = Integer.parseInt(scan.nextLine());
    char character = (char) ascii;
    System.out.println(character);
  }
}
