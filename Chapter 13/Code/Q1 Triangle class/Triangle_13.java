import java.util.Scanner;

class Triangle_13 extends Geometric_Object {
    private double side1;
    private double side2;
    private double side3;

    public Triangle_13(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        double s = (side1 + side2 + side3) / 2;  
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); 
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}
