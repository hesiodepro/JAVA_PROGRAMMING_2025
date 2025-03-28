public class Chapter13_Rectangle extends Chapter13_GeometricObject {
    private double width;
    private double height;

    public Chapter13_Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
