
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter integer between 0 to 1000: ");
    int input = Integer.parseInt(scan.nextLine());
    int div = 100;
    int total = 0;
    if (input<1000 && input > 0) {
      while (div > 0) {
        total = total + (input/div);
        System.out.println(input/div);
        int sub = (input/div)*div;
        input = input-sub;
        div = div/10;
      }
      System.out.println("Sum of all digits are: "total);
    }
  }
}
