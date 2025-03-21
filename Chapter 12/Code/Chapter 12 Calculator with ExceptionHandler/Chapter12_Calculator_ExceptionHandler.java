import java.util.Scanner;

public class Chapter12_Calculator_ExceptionHandler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String firstInput = input.nextLine();

        System.out.print("Enter second number: ");
        String secondInput = input.nextLine();

        try {
            double num1 = Double.parseDouble(firstInput);
            double num2 = Double.parseDouble(secondInput);

            double sum = num1 + num2;
            System.out.println("The sum is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Error: Non-numeric operand entered. Please enter valid numbers.");
        }
    }
}
