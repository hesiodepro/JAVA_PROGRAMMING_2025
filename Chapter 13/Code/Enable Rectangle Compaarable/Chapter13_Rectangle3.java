public class Chapter13_Rectangle3 extends Chapter13_GeometricObjects5 implements Comparable<Chapter13_Rectangle3> {
    private double width;
    private double height;

    public Chapter13_Rectangle3(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public int compareTo(Chapter13_Rectangle3 other) {
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
        Chapter13_Rectangle3 other = (Chapter13_Rectangle3) obj;
        return Double.compare(this.getArea(), other.getArea()) == 0; 
    }

    @Override
    public String toString() {
        return "Rectangle(width=" + width + ", height=" + height + ")";
    }
}
