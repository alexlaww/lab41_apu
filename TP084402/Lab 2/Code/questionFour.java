import java.util.Scanner;

public class questionFour {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String letter = scanner.next();
        String output = letter.toUpperCase();
        System.out.println(output);
    }
}
