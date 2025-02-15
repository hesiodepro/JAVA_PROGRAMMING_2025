import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
     public static void main (String[] args){
         //Create a scanner object
         Scanner input = new Scanner(System.in);
         
         //Prompt the user to enter radius
         System.out.println("Enter the radius: ");
         double radius = input.nextDouble();
         
         //Compute area
         double area = radius * radius * 3.14159;
         
         //Display results
         System.out.println("The area for the circle of radius is" + radius + " is " + area);
    }
}
