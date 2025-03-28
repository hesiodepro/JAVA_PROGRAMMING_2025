public abstract class Chapter13_GeometricObject implements Comparable<Chapter13_GeometricObject> {
    private double area;

    public abstract double getArea();

    @Override
    public int compareTo(Chapter13_GeometricObject o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    public static Chapter13_GeometricObject max(Chapter13_GeometricObject o1, Chapter13_GeometricObject o2) {
        return (o1.compareTo(o2) > 0) ? o1 : o2;
    }
}
