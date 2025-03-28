public class Chapter13_Circle2 extends Chapter13_GeometricObject2 {
    private double radius;

    public Chapter13_Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}
