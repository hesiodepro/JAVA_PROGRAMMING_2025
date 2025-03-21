import java.io.*;
import java.util.*;

public class Chapter12_CountChar_Words_Lines{
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java CountFileStatistics <filename>");
            return;
        }

        String filename = args[0];
        
        int numOfLines = 0;
        int numOfWords = 0;
        int numOfCharacters = 0;

        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                numOfLines++;
                numOfCharacters += line.length();

                String[] words = line.split("\\s+");
                numOfWords += words.length;
            }
            fileScanner.close();

            System.out.println("Number of lines: " + numOfLines);
            System.out.println("Number of words: " + numOfWords);
            System.out.println("Number of characters: " + numOfCharacters);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
