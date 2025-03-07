import java.util.Random;

public class Chapter8_LargestRowAndColumn {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = random.nextInt(2);
            }
        }
        
        printMatrix(matrix);
        
        int maxRowIndex = 0, maxColIndex = 0;
        int maxRowCount = 0, maxColCount = 0;
        
        for (int i = 0; i < 4; i++) {
            int rowCount = 0;
            for (int j = 0; j < 4; j++) {
                rowCount += matrix[i][j];
            }
            if (rowCount > maxRowCount) {
                maxRowCount = rowCount;
                maxRowIndex = i;
            }
        }
        
        for (int j = 0; j < 4; j++) {
            int colCount = 0;
            for (int i = 0; i < 4; i++) {
                colCount += matrix[i][j];
            }
            if (colCount > maxColCount) {
                maxColCount = colCount;
                maxColIndex = j;
            }
        }
        
        System.out.println("The largest row index: " + maxRowIndex);
        System.out.println("The largest column index: " + maxColIndex);
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
