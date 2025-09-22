import java.util.Scanner;

public class InvestmentValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investmentAmount = scanner.nextDouble();
        System.out.print("Enter annual interest rate (in %): ");
        double annualRate = scanner.nextDouble();
        double monthlyRate = annualRate / 1200;
        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyRate, years * 12);
        System.out.println("Future investment value is: " + futureInvestmentValue);
        scanner.close();
    }
}