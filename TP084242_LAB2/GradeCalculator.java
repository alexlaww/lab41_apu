import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();
        String grade, description;
        if (marks >= 80 && marks <= 100) { grade = "A+"; description = "Excellent"; }
        else if (marks >= 75) { grade = "A"; description = "Distinction"; }
        else if (marks >= 70) { grade = "B+"; description = "Very Good"; }
        else if (marks >= 65) { grade = "B"; description = "Credit"; }
        else if (marks >= 55) { grade = "C"; description = "Pass"; }
        else if (marks >= 50) { grade = "D"; description = "Pass"; }
        else if (marks >= 40) { grade = "F+"; description = "Marginal Fail"; }
        else { grade = "F"; description = "Fail"; }
        System.out.println("Grade: " + grade + " (" + description + ")");
        scanner.close();
    }
}