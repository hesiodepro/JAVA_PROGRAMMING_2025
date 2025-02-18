
import java.util.Scanner;

public class Chapter2_FeetIntoMeters {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number in feet: ");
        double feet = input.nextDouble();
        
        double meter = feet * 0.305;
        
        System.out.println(feet +  " Ft " + " is " + meter + " in meters ");
     }
}
