import java.util.Scanner;

public class Chapter7_ComputeDeviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }
        
        double meanValue = mean(numbers);
        double deviationValue = deviation(numbers);
        
        System.out.printf("The mean is %.2f\n", meanValue);
        System.out.printf("The standard deviation is %.5f\n", deviationValue);
    }

    public static double mean(double[] x) {
        double sum = 0;
        for (double num : x) {
            sum += num;
        }
        return sum / x.length;
    }

    public static double deviation(double[] x) {
        double meanValue = mean(x);
        double sumSquaredDifferences = 0;
        
        for (double num : x) {
            sumSquaredDifferences += Math.pow(num - meanValue, 2);
        }
        
        return Math.sqrt(sumSquaredDifferences / (x.length - 1));
    }
}
