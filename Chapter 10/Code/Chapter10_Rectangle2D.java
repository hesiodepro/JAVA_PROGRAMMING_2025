
import java.util.Scanner;

public class Chapter10_Rectangle2D {
    private double x; // center x
    private double y; // center y
    private double width;
    private double height;

    public Chapter10_Rectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    
    public class Geometry {
    public static Chapter10_Rectangle2D getRectangle(double[][] points) {
        double minX = points[0][0];
        double maxX = points[0][0];
        double minY = points[0][1];
        double maxY = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] < minX) minX = points[i][0];
            if (points[i][0] > maxX) maxX = points[i][0];
            if (points[i][1] < minY) minY = points[i][1];
            if (points[i][1] > maxY) maxY = points[i][1];
        }

        double centerX = (minX + maxX) / 2;
        double centerY = (minY + maxY) / 2;
        double width = maxX - minX;
        double height = maxY - minY;

        return new Chapter10_Rectangle2D(centerX, centerY, width, height);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter five points:");
        double[][] points = new double[5][2];
        for (int i = 0; i < 5; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        Chapter10_Rectangle2D rectangle = Chapter10_Rectangle2D.Geometry.getRectangle(points);

        System.out.println("The bounding rectangle's center (" + rectangle.getX() + ", " + rectangle.getY() + ")");
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
    }

}


    
