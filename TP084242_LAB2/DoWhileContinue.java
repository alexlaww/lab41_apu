import java.util.Scanner;

public class DoWhileContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Program is running...");
            System.out.print("Do you want to continue? (Yes/No): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("Yes"));
        System.out.println("Program terminated.");
        scanner.close();
    }
}