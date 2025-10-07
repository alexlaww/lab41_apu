
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String[][] months = {
      {"January", "31", "31"},
      {"February", "28", "29"},
      {"March", "31", "31"},
      {"April", "30", "30"},
      {"May", "31", "31"},
      {"June", "30", "30"},
      {"July", "31", "31"},
      {"August", "30", "30"},
      {"September", "31", "31"},
      {"October", "30", "30"},
      {"November", "31", "31"},
      {"December", "31", "31"}
    };
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a month of a year(case-sensitive): ");
    String month = scan.nextLine();
    System.out.println("Enter year: ");
    int year = Integer.parseInt(scan.nextLine());
    for (int i = 0; i < months.length; i++) { 
      if (month.toLowerCase().trim() == months[i][0].toLowerCase()) {
        System.out.print(year%4);
        if ((year%4) == 0) {
          System.out.println("The month " + month + " has " + months[i][2] + " days");
        }
        else {
          System.out.println("The month " + month + " has " + months[i][1] + " days");
        }
      }
    }
  }
}
