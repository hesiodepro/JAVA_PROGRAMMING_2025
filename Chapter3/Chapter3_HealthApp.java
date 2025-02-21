import java.util.Scanner;

public class Chapter3_HealthApp {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter feet: ");
        int feet = input.nextInt();

        System.out.print("Enter inches: ");
        int inches = input.nextInt();

        int totalInches = (feet * 12) + inches;

        double heightInMeters = totalInches * 0.0254;
        double weightInKg = weight * 0.45359237;

        double bmi = weightInKg / (heightInMeters * heightInMeters);

        System.out.println("BMI is " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
