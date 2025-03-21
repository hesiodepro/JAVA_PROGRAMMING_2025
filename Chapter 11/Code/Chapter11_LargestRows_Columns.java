import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Chapter11_LargestRows_Columns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];
        Random rand = new Random();
        
        // Fill the matrix with random 0s and 1s
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(2);
            }
        }

        // Print the matrix
        System.out.println("The random array is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        // Find the row with the most 1s
        int maxRowCount = 0;
        ArrayList<Integer> maxRowIndices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int rowCount = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    rowCount++;
                }
            }
            if (rowCount > maxRowCount) {
                maxRowCount = rowCount;
                maxRowIndices.clear();
                maxRowIndices.add(i);
            } else if (rowCount == maxRowCount) {
                maxRowIndices.add(i);
            }
        }

        // Find the column with the most 1s
        int maxColCount = 0;
        ArrayList<Integer> maxColIndices = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            int colCount = 0;
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] == 1) {
                    colCount++;
                }
            }
            if (colCount > maxColCount) {
                maxColCount = colCount;
                maxColIndices.clear();
                maxColIndices.add(j);
            } else if (colCount == maxColCount) {
                maxColIndices.add(j);
            }
        }

        // Print the row and column indices with the most 1s
        System.out.print("The largest row index: ");
        for (int i = 0; i < maxRowIndices.size(); i++) {
            System.out.print(maxRowIndices.get(i));
            if (i < maxRowIndices.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("The largest column index: ");
        for (int i = 0; i < maxColIndices.size(); i++) {
            System.out.print(maxColIndices.get(i));
            if (i < maxColIndices.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
