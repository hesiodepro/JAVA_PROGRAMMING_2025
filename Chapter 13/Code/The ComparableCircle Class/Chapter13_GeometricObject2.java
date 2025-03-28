public abstract class Chapter13_GeometricObject2 {
    public abstract double getArea();

    public static Chapter13_GeometricObject2 max(Chapter13_GeometricObject2 o1, Chapter13_GeometricObject2 o2) {
        return (o1.getArea() > o2.getArea()) ? o1 : o2;
    }
}
