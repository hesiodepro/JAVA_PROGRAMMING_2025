
import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Eneter purchase amount: ");
        double purchaseAmount = input.nextDouble();
        
        double tax = purchaseAmount * 0.06;
        System.out.println("Salestax is $ " + (int)(tax * 100) / 100.0);
        
    }
}
