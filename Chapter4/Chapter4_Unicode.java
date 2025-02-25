import java.util.Scanner;

public class Chapter4_Unicode {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);
        
        int unicode = (int) character;
        
        System.out.printf("The Unicode for the character %c is %d\n", character, unicode);
    }
}
