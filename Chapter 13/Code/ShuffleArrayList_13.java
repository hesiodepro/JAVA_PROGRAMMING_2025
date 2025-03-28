import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList_13 {

    public static void shuffle(ArrayList<Number> list) {
        Collections.shuffle(list);
    }

    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2.5);
        numbers.add(3);
        numbers.add(4.7);
        numbers.add(5.1);
        numbers.add(6);
        numbers.add(7.2);

        System.out.println("Before shuffling: " + numbers);

        shuffle(numbers);

        System.out.println("After shuffling: " + numbers);
    }
}
