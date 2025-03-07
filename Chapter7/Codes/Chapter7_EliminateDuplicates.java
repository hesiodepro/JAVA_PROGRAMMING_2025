import java.util.Scanner;
import java.util.LinkedHashSet;

public class Chapter7_EliminateDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }
        
        int[] distinctNumbers = eliminateDuplicates(numbers);
        
        System.out.print("The distinct numbers are: ");
        for (int num : distinctNumbers) {
            System.out.print(num + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : list) {
            set.add(num);
        }
        
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }
}
