import java.util.Scanner;

public class questionFive {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ASCII code: ");
        int asciiCode = scanner.nextInt();
        System.out.println((char)asciiCode);
    }
}
