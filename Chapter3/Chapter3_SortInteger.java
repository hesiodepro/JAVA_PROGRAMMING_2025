import java.util.Scanner;

public class Chapter3_SortInteger {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter three integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        
        int sort;
        if (num1 > num2) {
            sort = num1;
            num1 = num2;
            num2 = sort;
        }
        if (num2 > num3) {
            sort = num2;
            num2 = num3;
            num3 = sort;
        }
        if (num1 > num2) {
            sort = num1;
            num1 = num2;
            num2 = sort;
        }
        
        System.out.println("Numbers in non-decreasing order: " + num1 + " " + num2 + " " + num3);
    }
}
