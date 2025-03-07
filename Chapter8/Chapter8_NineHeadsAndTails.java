import java.util.Scanner;

public class Chapter8_NineHeadsAndTails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int number = input.nextInt();
        
        String binaryString = String.format("%9s", Integer.toBinaryString(number)).replace(' ', '0');
        
        for (int i = 0; i < 9; i++) {
            System.out.print(binaryString.charAt(i) == '0' ? "H " : "T ");
            if (i % 3 == 2) System.out.println();
        }
    }
}
