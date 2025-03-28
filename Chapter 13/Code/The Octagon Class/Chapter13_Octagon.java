public class Chapter13_Octagon extends Chapter13_GeometricObjects6 implements Comparable<Chapter13_Octagon>, Cloneable {
    private double side;

    public Chapter13_Octagon() {
        this.side = 0;
    }

    public Chapter13_Octagon(double side) {
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
        return (3 * Math.sqrt(2) * side * side);  
    }

    public double getPerimeter() {
        return 8 * side;  
    }
    @Override
    public int compareTo(Chapter13_Octagon other) {
        double thisArea = this.getArea();
        double otherArea = other.getArea();
        return Double.compare(thisArea, otherArea);
    }

    @Override
    public Object clone() {
        try {
            return super.clone();  
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Octagon with side = " + side;
    }
}
