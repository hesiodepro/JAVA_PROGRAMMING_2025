import java.util.Scanner;

public class Chapter12_Bin2Dec {
    
    public static int bin2Dec(String binaryString) throws NumberFormatException {
 
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
                throw new NumberFormatException("Not a binary number");
            }
        }

        return Integer.parseInt(binaryString, 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryString = input.nextLine();

        try {
            int decimalValue = bin2Dec(binaryString);
            System.out.println("The decimal equivalent is: " + decimalValue);
        } catch (NumberFormatException e) {
            System.out.println("Not a binary number");
        }
    }
}
