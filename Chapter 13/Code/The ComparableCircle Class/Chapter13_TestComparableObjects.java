public class Chapter13_TestComparableObjects {
    public static void main(String[] args) {
        Chapter13_ComparableCircle circle1 = new Chapter13_ComparableCircle(5);
        Chapter13_ComparableCircle circle2 = new Chapter13_ComparableCircle(7);
        
        Chapter13_Rectangle2 rectangle1 = new Chapter13_Rectangle2(4, 6);
        Chapter13_Rectangle2 rectangle2 = new Chapter13_Rectangle2(5, 5);
        
      
        Chapter13_GeometricObject2 largerCircleVsRectangle = Chapter13_GeometricObject2.max(circle1, rectangle1);
        
        System.out.println("Larger Circle Area: " + largerCircle.getArea());
        System.out.println("Larger Circle vs Rectangle Area: " + largerCircleVsRectangle.getArea());
    }
}
