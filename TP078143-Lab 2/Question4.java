import java.util.Scanner;
public class Question4 {
    public static void main(String[] args){
        /* LAB 2 QUESTION 4 */
        // input //
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an uppercase letter: ");
        char uppercaseletter = scanner.next().charAt(0); // for index 0

        // input check //
        if (uppercaseletter >= 'A' && uppercaseletter <= 'Z'){
            char lowercaseletter = Character.toLowerCase(uppercaseletter);

            System.out.println("The lowercase letter is: "+ lowercaseletter);
        } else {
            System.out.println("Please enter a valid uppercase letter.");
        }

        scanner.close();

    }
}
