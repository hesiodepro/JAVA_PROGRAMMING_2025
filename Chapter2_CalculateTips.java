
import java.util.Scanner;

public class Chapter2_CalculateTips {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the subtotal: ");
        double subtotal = input.nextDouble();
        System.out.println("Enter a gratuity rate: ");
        double gratuityRate = input.nextDouble();
        
        
         double gratuity = subtotal *  (gratuityRate/100);
         double total = subtotal + gratuity;
         
         System.out.println("The gratuity is: " + gratuity + " and the total is: " + total);
    }
}
