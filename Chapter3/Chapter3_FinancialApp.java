import java.util.Scanner;

public class Chapter3_FinancialApp {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an amount in cents: ");
        int amount = input.nextInt();
        
        int dollars = amount / 100;
        amount %= 100;
        
        int quarters = amount / 25;
        amount %= 25;
        
        int dimes = amount / 10;
        amount %= 10;
        
        int nickels = amount / 5;
        amount %= 5;
        
        int pennies = amount;
        
        if (dollars > 0) {
            System.out.println(dollars + (dollars == 1 ? " dollar" : " dollars"));
        }
        if (quarters > 0) {
            System.out.println(quarters + (quarters == 1 ? " quarter" : " quarters"));
        }
        if (dimes > 0) {
            System.out.println(dimes + (dimes == 1 ? " dime" : " dimes"));
        }
        if (nickels > 0) {
            System.out.println(nickels + (nickels == 1 ? " nickel" : " nickels"));
        }
        if (pennies > 0) {
            System.out.println(pennies + (pennies == 1 ? " penny" : " pennies"));
        }
    }
}
