import java.util.Scanner;

public class Chapter12_HexToDecimal {

    public static int hex2Dec(String hexString) {
        try {
            return Integer.parseInt(hexString, 16);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Not a hex number");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        String hexString = input.nextLine();

        try {
            int decimal = hex2Dec(hexString);
            System.out.println("Decimal equivalent: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Not a hex number");
        }

    }
}
