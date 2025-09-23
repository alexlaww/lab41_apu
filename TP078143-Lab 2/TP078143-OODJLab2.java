import java.util.Scanner;
public class Question11 {
    public static void main(String[] args){
       /* LAB 2 QUESTION 11 */
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Enter investment amount: ");
       double investAmount = scanner.nextDouble();
       
       System.out.print("Enter annual interest rate: ");
       double annualInterestrate = scanner.nextDouble();
       
       System.out.print("Enter number of years: ");
       int year = scanner.nextInt();
       
       double monthlyInterestRate = annualInterestrate / 100 / 12;
       double futureInvestmentValue = investAmount * Math.pow(1 + monthlyInterestRate, year * 12); // math.pow(a,b) = a^b
       System.out.printf("Future investmen value is %.2f", futureInvestmentValue);
    }
    
}