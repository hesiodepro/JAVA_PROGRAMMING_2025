
import java.util.Scanner;

public class Chapter2_PoundsIntoKilograms {
    public static void main (String[] ars){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of pounds: ");
        double pounds = input.nextDouble();
        
        double kilograms = pounds * 0.454;
        
        System.out.println( pounds + " Pounds = " + kilograms + " kilograms");
    }
    
}
