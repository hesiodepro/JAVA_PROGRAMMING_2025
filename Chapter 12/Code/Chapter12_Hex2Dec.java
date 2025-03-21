import java.util.Scanner;

class HexFormatException extends Exception {
    public HexFormatException(String message) {
        super(message);
    }
}

public class Chapter12_Hex2Dec {

    public static int hex2Dec(String hexString) throws HexFormatException {
        try {
            return Integer.parseInt(hexString, 16);
        } catch (NumberFormatException e) {
            throw new HexFormatException("Not a hex number");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        String hexString = input.nextLine();

        try {
            int decimal = hex2Dec(hexString);
            System.out.println("Decimal equivalent: " + decimal);
        } catch (HexFormatException e) {
            System.out.println(e.getMessage());
        }

    }
}
