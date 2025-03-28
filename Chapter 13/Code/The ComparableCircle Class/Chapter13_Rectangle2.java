public class Chapter13_Rectangle2 extends Chapter13_GeometricObject2 {
    private double width;
    private double height;

    public Chapter13_Rectangle2(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
