public class Chapter13_Circle4 extends Chapter13_GeometricObjects7 {
    private double radius;

    public Chapter13_Circle4(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;  
    }
}
