import java.util.Random;

public class Chapter4_RandomPointOnCircle {
    public static void main(String[] args) {
        final double RADIUS = 40;
        Random random = new Random();
        
        double[] point1 = generateRandomPoint(RADIUS, random);
        double[] point2 = generateRandomPoint(RADIUS, random);
        double[] point3 = generateRandomPoint(RADIUS, random);
        
        double a = distance(point2, point3);
        double b = distance(point1, point3);
        double c = distance(point1, point2);
        
        double angleA = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c)));
        double angleB = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c)));
        double angleC = 180 - angleA - angleB;
        
        System.out.printf("The angles of the triangle are: %.2f, %.2f, and %.2f degrees\n", angleA, angleB, angleC);
    }
    
    public static double[] generateRandomPoint(double radius, Random random) {
        double angle = random.nextDouble() * 2 * Math.PI;
        double x = radius * Math.cos(angle);
        double y = radius * Math.sin(angle);
        return new double[]{x, y};
    }
    
    public static double distance(double[] p1, double[] p2) {
        return Math.sqrt(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2));
    }
}
