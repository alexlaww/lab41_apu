public class SumArray {
    public static void main(String[] args) {
        double[] numbers = new double[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        System.out.println("The sum of the array values is: " + sum);
    }
}