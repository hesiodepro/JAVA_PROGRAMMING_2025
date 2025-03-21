import java.io.*;
import java.util.*;

public class Chapter12_ProcessScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the filename: ");
        String filename = input.nextLine();

        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);

            int totalScores = 0;
            int numberOfScores = 0;

            // Read all scores from the file
            while (fileScanner.hasNext()) {
                if (fileScanner.hasNextInt()) {
                    int score = fileScanner.nextInt();
                    totalScores += score;
                    numberOfScores++;
                } else {
                    fileScanner.next(); // Skip non-integer tokens
                }
            }

            fileScanner.close();

            if (numberOfScores > 0) {
                double average = (double) totalScores / numberOfScores;
                System.out.println("Total scores: " + totalScores);
                System.out.println("Average score: " + average);
            } else {
                System.out.println("No scores found in the file.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
