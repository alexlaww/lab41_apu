import java.util.Scanner;

public class AsciiToChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an ASCII code (0-128): ");
        int code = scanner.nextInt();
        char character = (char) code;
        System.out.println("The character for ASCII " + code + " is: " + character);
        scanner.close();
    }
}