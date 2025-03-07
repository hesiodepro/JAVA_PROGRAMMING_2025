import java.util.Scanner;

public class Chapter7_AnalyzeScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[100];
        int count = 0, sum = 0;

        System.out.print("Enter scores (negative number to stop): ");
        while (count < 100) {
            int score = input.nextInt();
            if (score < 0) break;
            scores[count++] = score;
            sum += score;
        }

        if (count == 0) {
            System.out.println("No scores entered.");
            input.close();
            return;
        }

        double average = (double) sum / count;
        int aboveOrEqual = 0, below = 0;

        for (int i = 0; i < count; i++) {
            if (scores[i] >= average) aboveOrEqual++;
            else below++;
        }

        System.out.println("Average score: " + average);
        System.out.println("Scores above or equal to average: " + aboveOrEqual);
        System.out.println("Scores below average: " + below);
    }
}
