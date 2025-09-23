import java.util.Scanner;

public class questionOne {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheitTemp = scanner.nextDouble();
        double celsiusTemp = (fahrenheitTemp - 32) * 5 / 9;

        System.out.println(fahrenheitTemp + " in Celsius is " + celsiusTemp);
    }
}
