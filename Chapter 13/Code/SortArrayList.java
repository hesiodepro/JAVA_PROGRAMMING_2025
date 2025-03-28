import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList_13 {

    public static void sort(ArrayList<Number> list) {
        Collections.sort(list, (a, b) -> Double.compare(a.doubleValue(), b.doubleValue()));
    }

    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(3.2);
        numbers.add(1);
        numbers.add(4.7);
        numbers.add(2);
        numbers.add(5.6);
        numbers.add(0.9);
        numbers.add(3);

        System.out.println("Before sorting: " + numbers);

        sort(numbers);

        System.out.println("After sorting: " + numbers);
    }
}
