import java.util.Scanner;
import java.util.InputMismatchException;

public class Chapter12_InputMismatchException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        while (true) {
            try {
                System.out.print("Enter the first integer: ");
                num1 = input.nextInt();
                System.out.print("Enter the second integer: ");
                num2 = input.nextInt();
                break; // Exit loop if both numbers are entered correctly
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter valid integers.");
                input.nextLine(); 
            }
        }

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}
