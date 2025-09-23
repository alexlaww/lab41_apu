import java.util.Scanner;

public class questionTwo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double PI = 22.0 / 7;
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the length of the length: ");
        double length = scanner.nextDouble();

        double area = Math.pow(radius, 2) * PI;
        double volume = area * length;

        System.out.println("The area of the cylinder is " + area);
        System.out.println("The volume of the cylinder is " + volume);
    }
}
