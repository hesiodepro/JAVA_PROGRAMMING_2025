public class Chapter13_Circle3 extends Chapter13_GeometricObjects4 implements Comparable<Chapter13_Circle3> {
    private double radius;

    public Chapter13_Circle3(double radius) {
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

    @Override
    public int compareTo(Chapter13_Circle3 other) {
        double thisArea = this.getArea();
        double otherArea = other.getArea();
        return Double.compare(thisArea, otherArea);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;  
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; 
        }
        Chapter13_Circle3 other = (Chapter13_Circle3) obj;
        return Double.compare(this.radius, other.radius) == 0; 
    }

    @Override
    public String toString() {
        return "Circle(radius=" + radius + ")";
    }
}
