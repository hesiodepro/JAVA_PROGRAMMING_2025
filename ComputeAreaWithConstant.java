
import java.util.Scanner; //Scanner in the java.util package

public class ComputeAreaWithConstant {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        final double PI = 3.14159; //Declare a constant
        
        //Prompt user to enter radius
        System.out.println("Enter the radius: ");
        double radius = input.nextDouble();
        
        //Compute Area
        double area = radius * radius * PI;
        
        //Display result
        System.out.println("The area for the circle of radius" + radius + " is " + area);
        
    }
}
