import java.util.ArrayList;
import java.util.Scanner;

public class Chapter11_MaxElement {

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }

        Integer max = list.get(0);
        for (Integer num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int num;

        System.out.println("Enter a sequence of numbers (end with 0):");

        while (true) {
            num = input.nextInt();
            if (num == 0) {
                break;
            }
            numbers.add(num);
        }

        Integer maxNumber = max(numbers);

        if (maxNumber != null) {
            System.out.println("The largest number is: " + maxNumber);
        } else {
            System.out.println("No valid input provided.");
        }

    }
}
