import java.util.Scanner;

public class Chapter7_ReverseAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }
        
        reverse(numbers);
        
        System.out.println("Reversed array:");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static double[] reverse(double[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            double temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return array;
    }
}
