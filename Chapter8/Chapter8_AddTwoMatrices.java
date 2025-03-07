import java.util.Scanner;

public class Chapter8_AddTwoMatrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        
        System.out.println("Enter matrix1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }
        
        System.out.println("Enter matrix2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }
        
        double[][] resultMatrix = addMatrix(matrix1, matrix2);
        
        System.out.println("The matrices are added as follows");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%4.1f", matrix1[i][j]);
            }
            System.out.print("    ");
            for (int j = 0; j < 3; j++) {
                System.out.printf("%4.1f", matrix2[i][j]);
            }
            System.out.print("    ");
            for (int j = 0; j < 3; j++) {
                System.out.printf("%4.1f", resultMatrix[i][j]);
            }
            System.out.println();
        }
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] result = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
}
