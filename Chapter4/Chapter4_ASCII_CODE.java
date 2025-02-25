import java.util.Scanner;

public class Chapter4_ASCII_CODE {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an ASCII code: ");
        int asciiCode = input.nextInt();
        
        if (asciiCode >= 0 && asciiCode <= 127) {
            
            char character = (char) asciiCode;
            
            System.out.printf("The character for ASCII code %d is %c\n", asciiCode, character);
        } else {
            
            System.out.println("Invalid ASCII code. Please enter a number between 0 and 127.");
        }
    }
}
