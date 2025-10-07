
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[][] grades = {
      {"40", "F", "Fail"},
      {"50", "F+", "Marginal Fail"},
      {"55", "D", "Pass"},
      {"65", "C", "Pass"},
      {"70", "B", "Credit"},
      {"75", "B+", "Credit"},
      {"80", "A", "Distinction"},
      {"101", "A+", "Distinction"}
    };
    System.out.println("Enter marks, 0 - 100: ");
    int grade = Integer.parseInt(scan.nextLine());
    for (int i = 0; i < grades.length; i++) {
      if (grade<Integer.parseInt(grades[i][0])) {
        System.out.println("You get a grade of " + grades[i][1]);
        System.out.println(grades[i][2]);
        break;
      }
    }
  }
}
