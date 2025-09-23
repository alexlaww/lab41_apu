import java.util.Scanner;

public class questionSeven {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter mark: ");
        int mark = scan.nextInt();
        String grade = "";

        if (mark < 40){
            grade = "F";
        }
        else if (mark < 50){
            grade = "F+";
        }
        else if (mark < 55){
            grade = "D";
        }
        else if (mark < 65){
            grade = "C";
        }
        else if (mark < 70) {
            grade = "B";
        }
        else if (mark < 75){
            grade = "B+";
        }
        else if (mark < 80){
            grade = "A";
        }
        else{
            grade = "A+";
        }
        System.out.println(grade);
    }
}
