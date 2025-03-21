import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Chapter11_SortArrayList {

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            numbers.add(input.nextInt());
        }

        sort(numbers);

        System.out.println("Numbers in increasing order:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

    }
}
