import java.util.ArrayList;
import java.util.Collections;

public class Chapter11_ShuffleArrayList {
    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        shuffle(list);
        
        System.out.println(list);
    }
}
