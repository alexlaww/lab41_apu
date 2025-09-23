import java.util.Scanner;

public class questionThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int sum = 0;
        String[] digits = Integer.toString(number).split("");
        for (String digit : digits) {
            sum += Integer.parseInt(digit);
        }
        System.out.println("Sum of the digits is " + sum);
    }
}
