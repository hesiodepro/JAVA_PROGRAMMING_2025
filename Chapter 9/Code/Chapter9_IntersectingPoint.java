import java.util.Scanner;

class LinearEquation {
    private double a, b, c, d, e, f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }
    public double getD() { return d; }
    public double getE() { return e; }
    public double getF() { return f; }

    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    public double getX() {
        if (isSolvable()) {
            return (e * d - b * f) / (a * d - b * c);
        } else {
            throw new ArithmeticException("The equation has no solution.");
        }
    }

    public double getY() {
        if (isSolvable()) {
            return (a * f - e * c) / (a * d - b * c);
        } else {
            throw new ArithmeticException("The equation has no solution.");
        }
    }
}

public class Chapter9_IntersectingPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        
        double a = y1 - y2;
        double b = x2 - x1;
        double c = y3 - y4;
        double d = x4 - x3;
        double e = a * x1 + b * y1;
        double f = c * x3 + d * y3;
        
        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);
        
        if (equation.isSolvable()) {
            System.out.println("The intersecting point is at (" + equation.getX() + ", " + equation.getY() + ")");
        } else {
            System.out.println("The two lines are parallel and do not intersect.");
        }
    }
}
