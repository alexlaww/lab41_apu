import java.util.ArrayList;
import java.util.Scanner;

public class questionEight {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true || i != 100){
            i++;
            System.out.print("Enter an integer: ");
            int temp = scan.nextInt();
            if (temp != 0){
                numbers.add(temp);
            }
            else{
                break;
            }
        }
        for (int number : numbers){
            sum += number;
        }
        System.out.println(sum);
    }
}
