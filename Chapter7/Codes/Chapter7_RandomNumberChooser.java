import java.util.HashSet;
import java.util.Random;

public class Chapter7_RandomNumberChooser {
    public static void main(String[] args) {
        for (int i = 0; i < 45; i++) {
            System.out.printf("%4d", getRandom(1, 100, 4, 8, 95, 93));
            if ((i + 1) % 15 == 0) {
                System.out.println();
            }
        }
    }

    public static int getRandom(int start, int end, int... numbers) {
        HashSet<Integer> excluded = new HashSet<>();
        for (int num : numbers) {
            excluded.add(num);
        }
        
        Random random = new Random();
        int randNum;
        do {
            randNum = random.nextInt(end - start + 1) + start;
        } while (excluded.contains(randNum));
        
        return randNum;
    }
}
