public class Chapter13_Circle extends Chapter13_GeometricObject {
    private double radius;

    public Chapter13_Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
