import java.util.Scanner;

class Location {
    public int row;
    public int column;
    public double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }
}

public class Chapter9_Location {
    public static Location locateLargest(double[][] a) {
        int maxRow = 0;
        int maxCol = 0;
        double maxVal = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxVal) {
                    maxVal = a[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        return new Location(maxRow, maxCol, maxVal);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        double[][] array = new double[rows][cols];

        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        Location loc = locateLargest(array);
        System.out.println("The location of the largest element is " + loc.maxValue + " at (" + loc.row + ", " + loc.column + ")");
    }
}
