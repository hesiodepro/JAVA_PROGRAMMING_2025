import java.io.*;
import java.util.*;

public class Chapter12_RemoveText {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java RemoveTextFromFile <string_to_remove> <filename>");
            return;
        }

        String stringToRemove = args[0];
        String filename = args[1];

        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);
            StringBuilder content = new StringBuilder();

            while (fileScanner.hasNextLine()) {
                content.append(fileScanner.nextLine()).append(System.lineSeparator());
            }
            fileScanner.close();

            String modifiedContent = content.toString().replace(stringToRemove, "");

            FileWriter writer = new FileWriter(file);
            writer.write(modifiedContent);
            writer.close();

            System.out.println("The string \"" + stringToRemove + "\" has been removed from the file.");

        } catch (IOException e) {
            System.out.println("An error occurred while processing the file: " + e.getMessage());
        }
    }
}
