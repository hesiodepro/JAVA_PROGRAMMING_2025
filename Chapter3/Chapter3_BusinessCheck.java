import java.util.Scanner;

public class Chapter3_BusinessCheck {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int first9Digits = input.nextInt();
        
        String digits = String.format("%09d", first9Digits);
        
        int checksum = 0;
        for (int i = 0; i < 9; i++) {
            checksum += (Character.getNumericValue(digits.charAt(i))) * (i + 1);
        }
        checksum %= 11;
        
        char lastDigit = (checksum == 10) ? 'X' : (char) ('0' + checksum);
        
        String isbn10 = digits + lastDigit;
        System.out.println("The ISBN-10 number is " + isbn10);
    }
}
