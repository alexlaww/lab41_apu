import java.util.Scanner;

public class questionTen {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Continue or End? (C/E): ");
            if (scan.nextLine().equals("E")){
                break;
            }
        }while (true);
    }
}
