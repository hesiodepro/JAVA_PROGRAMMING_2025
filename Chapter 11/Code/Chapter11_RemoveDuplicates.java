import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Chapter11_RemoveDuplicates {

    public static void removeDuplicate(ArrayList<Integer> list) {
        HashSet<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            numbers.add(input.nextInt());
        }

        removeDuplicate(numbers);

        System.out.print("The distinct integers are: ");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
