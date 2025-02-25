import java.util.Scanner;

public class Chapter4_DecimalToHex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();
        
        if (decimal >= 0 && decimal <= 15) {
            System.out.printf("The hex value is %X\n", decimal);
        } else {
            System.out.println("Invalid input");
        }
    }
}
