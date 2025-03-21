import java.io.*;
import java.util.*;

public class Chapter12_ReformatJavaCode {

    public static void reformatCode(String inputFile, String outputFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        
        String line;
        boolean isPreviousLineBrace = false;
        
        while ((line = reader.readLine()) != null) {
            // Remove leading and trailing whitespaces from the line
            line = line.trim();

            // Check for next-line brace style and convert it
            if (line.endsWith("{")) {
                // If the previous line had a brace, append this line to it
                if (isPreviousLineBrace) {
                    writer.write(" " + line);
                } else {
                    writer.write(line);
                }
                isPreviousLineBrace = true;
            } else if (line.startsWith("}")) {
                // Handle closing brace on its own
                writer.write(" " + line);
                isPreviousLineBrace = false;
            } else {
                // Just write regular lines
                writer.write(line);
                isPreviousLineBrace = false;
            }
            
            writer.newLine();
        }
        
        reader.close();
        writer.close();
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ReformatJavaCode <inputFile>");
            return;
        }

        String inputFile = args[0];
        String outputFile = "Reformatted_" + inputFile;

        try {
            reformatCode(inputFile, outputFile);
            System.out.println("Code has been reformatted and saved to " + outputFile);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
