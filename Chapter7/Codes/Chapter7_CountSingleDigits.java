import java.util.Random;

public class Chapter7_CountSingleDigits {
    public static void main(String[] args) {
        int[] counts = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            counts[rand.nextInt(10)]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " occurs " + counts[i] + " times");
        }
    }
}
