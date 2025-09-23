import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class questionSix {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scan.nextInt();
        System.out.print("Enter the month (1-12): ");
        int month = scan.nextInt();
        int dayCount = 0;

        Dictionary<Integer, Integer> months = new Hashtable<>();

        months.put(1, 31);
        months.put(2, 28);
        months.put(3, 31);
        months.put(4, 30);
        months.put(5, 31);
        months.put(6, 30);
        months.put(7, 31);
        months.put(8, 31);
        months.put(9, 30);
        months.put(10, 31);
        months.put(11, 30);
        months.put(12, 31);

        if (year % 4 == 0 && month == 2){
            dayCount = 29;
        }
        else{
            dayCount = months.get(month);
        }

        System.out.println(dayCount);
    }
}
