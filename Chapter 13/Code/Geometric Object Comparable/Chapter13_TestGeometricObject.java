public class Chapter13_TestGeometricObject {
    public static void main(String[] args) {
        Chapter13_Circle circle1 = new Chapter13_Circle(5);
        Chapter13_Circle circle2 = new Chapter13_Circle(7);
        
        Chapter13_Rectangle rectangle1 = new Chapter13_Rectangle(4, 6);
        Chapter13_Rectangle rectangle2 = new Chapter13_Rectangle(5, 5);
        
        Chapter13_GeometricObject largerCircle = Chapter13_GeometricObject.max(circle1, circle2);
        Chapter13_GeometricObject largerRectangle = Chapter13_GeometricObject.max(rectangle1, rectangle2);

        System.out.println("Larger circle area: " + largerCircle.getArea());
        System.out.println("Larger rectangle area: " + largerRectangle.getArea());
    }
}
