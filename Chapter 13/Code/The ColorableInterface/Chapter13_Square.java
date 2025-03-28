public class Chapter13_Square extends Chapter13_GeometricObjects3 implements Chapter13_Colorable {
    private double side;

    public Chapter13_Square() {
        this.side = 0;
    }

    public Chapter13_Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
