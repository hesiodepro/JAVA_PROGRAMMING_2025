
import java.util.Scanner;

public class Chapter2_Sum_Integer {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter digits from 0 to 1000: ");
        int number = input.nextInt();
        
        int sum =  0;
        
        while(number > 0){
        int digit = number % 10;
        
        sum += digit;
        
        number = number / 10;
    }
        System.out.println("The sum of the digits is: " + sum);
        
        
    }
}
