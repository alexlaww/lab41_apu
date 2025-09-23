import java.util.Scanner;

public class questionEleven {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investmentAmount = scan.nextDouble();
        System.out.print("Enter interest rate: ");
        double interestRate = scan.nextDouble();
        System.out.print("Enter number of years: ");
        int years = scan.nextInt();
        double futureValue = investmentAmount * Math.pow(interestRate, years * 12);
        System.out.println(futureValue);
    }
}
