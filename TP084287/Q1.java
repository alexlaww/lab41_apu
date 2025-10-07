
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter temperature in fahrenheit");
        String fahrenheit = scan.nextLine();
        double celcius = (Double.parseDouble(fahrenheit)-32)*5/9;
        System.out.println(fahrenheit + " Fahrenheit in celcius is " + celcius);
    }
}
