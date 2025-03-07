import java.util.Scanner;

public class Chapter7_ComputeGcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }
        
        System.out.println("The GCD is " + gcd(numbers));
    }

    public static int gcd(int... numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = gcdTwoNumbers(result, numbers[i]);
        }
        return result;
    }

    private static int gcdTwoNumbers(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
