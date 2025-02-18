
import java.util.Scanner;

public class Chapter2_CalculateEnergy {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the amount of water in kilograms: ");
        double M = input.nextDouble();
        
        System.out.println("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();
        
        System.out.println("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();
        
        double energy = M * (finalTemperature - initialTemperature) * 4184;
        
        System.out.println("The energy needed is: " + energy);
        
    }
}
