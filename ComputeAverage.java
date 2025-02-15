import java.util.Scanner;  //Scanner is in java.util package

public class ComputeAverage {
    public static void main(String[] args){
        //Create a scanner object
        Scanner input = new Scanner(System.in);
        
        //Prompt user to enter three numbers
        System.out.println("Enter three numbers: ");
        
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        
        //Compute average
        double average = (number1 + number2 + number3) / 3;
        
        //Display output
        System.out.println("The average of " + number1 + " " + number2 + " " + number3 + "is " + average);
    }
}
