import java.util.Random;
import java.util.Scanner;

public class Chapter12_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[100];

        // Fill the array with 100 random integers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000); // Random integers between 0 and 999
        }

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the index of the array: ");
        int index = input.nextInt();

        try {
            System.out.println("The value at index " + index + " is: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
    }
}
