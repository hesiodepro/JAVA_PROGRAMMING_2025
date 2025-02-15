import java.util.Scanner;

public class QuizCelsiusToFahrenheit {
    public static void main (String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a Celsius degree
        System.out.print("Enter the Celsius degree: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        // Display the result
        System.out.println("Celsius " + celsius + " is " + fahrenheit + " in Fahrenheit ");
    }
}
