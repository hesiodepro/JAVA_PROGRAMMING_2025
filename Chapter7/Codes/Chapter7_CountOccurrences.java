import java.util.Scanner;

public class Chapter7_CountOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] counts = new int[101];

        System.out.print("Enter the integers between 1 and 100: ");
        while (true) {
            int num = input.nextInt();
            if (num == 0) break;
            if (num >= 1 && num <= 100) counts[num]++;
        }

        for (int i = 1; i <= 100; i++) {
            if (counts[i] > 0) {
                System.out.println(i + " occurs " + counts[i] + (counts[i] > 1 ? " times" : " time"));
            }
        }
    }
}
