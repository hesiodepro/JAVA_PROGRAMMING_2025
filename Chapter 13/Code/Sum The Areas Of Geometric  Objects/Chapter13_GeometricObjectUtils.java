public class Chapter13_GeometricObjectUtils {
    public static double sumArea(Chapter13_GeometricObjects7[] a) {
        double totalArea = 0;
        for (Chapter13_GeometricObjects7 object : a) {
            totalArea += object.getArea();
        }
        return totalArea;
    }
}
