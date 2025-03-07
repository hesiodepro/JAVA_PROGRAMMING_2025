import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chapter8_AllClosestPairsOfPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of points: ");
        int numPoints = input.nextInt();
        double[][] points = new double[numPoints][3];
        
        System.out.println("Enter " + numPoints + " points:");
        for (int i = 0; i < numPoints; i++) {
            for (int j = 0; j < 3; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        
        List<int[]> closestPairs = new ArrayList<>();
        double shortestDistance = Double.MAX_VALUE;
        
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double dist = distance(points[i], points[j]);
                if (dist < shortestDistance) {
                    closestPairs.clear();
                    closestPairs.add(new int[]{i, j});
                    shortestDistance = dist;
                } else if (dist == shortestDistance) {
                    closestPairs.add(new int[]{i, j});
                }
            }
        }
        
        for (int[] pair : closestPairs) {
            int p1 = pair[0], p2 = pair[1];
            System.out.println("The closest two points are (" + points[p1][0] + ", " + points[p1][1] + ", " + points[p1][2] + ") and (" + points[p2][0] + ", " + points[p2][1] + ", " + points[p2][2] + ")");
        }
        
        System.out.println("Their distance is " + shortestDistance);
    }

    public static double distance(double[] p1, double[] p2) {
        return Math.sqrt(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2) + Math.pow(p2[2] - p1[2], 2));
    }
}
