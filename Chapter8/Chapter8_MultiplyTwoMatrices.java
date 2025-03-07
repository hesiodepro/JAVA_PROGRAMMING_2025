import java.util.Scanner;

public class Chapter8_MultiplyTwoMatrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SIZE = 3;
        double[][] matrix1 = new double[SIZE][SIZE];
        double[][] matrix2 = new double[SIZE][SIZE];
        
        System.out.print("Enter matrix1: ");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }
        
        System.out.print("Enter matrix2: ");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }
        
        double[][] resultMatrix = multiplyMatrix(matrix1, matrix2);
        
        System.out.println("The multiplication of the matrices is");
        printMatrix(matrix1);
        System.out.println("   *");
        printMatrix(matrix2);
        System.out.println("   =");
        printMatrix(resultMatrix);
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        double[][] result = new double[rowsA][colsB];
        
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
    
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%6.1f ", value);
            }
            System.out.println();
        }
    }
}
