import java.util.Scanner;

public class UpperToLower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an uppercase letter: ");
        char uppercase = scanner.next().charAt(0);
        char lowercase = Character.toLowerCase(uppercase);
        System.out.println("Lowercase letter is: " + lowercase);
        scanner.close();
    }
}