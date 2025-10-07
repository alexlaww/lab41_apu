
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean running = true;
    do {
      System.out.println("Do you want to continue the program? (Y/N)");
      choice = scan.nextLine().toLowerCase();
      switch (choice) {
        case "y":
          running = true;
          break;
        case "n":
          running = false;
          break;
        default:
          running = true;
          break;
      } while (running)
    }
  }
}
