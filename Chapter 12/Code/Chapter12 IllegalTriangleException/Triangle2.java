public class Triangle2 {
    private double side1;
    private double side2;
    private double side3;

    /** Construct a triangle with the specified sides */
    public Triangle2(double side1, double side2, double side3) throws Chapter12_IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 ||
            side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new Chapter12_IllegalTriangleException("Invalid sides for a triangle.");
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}
