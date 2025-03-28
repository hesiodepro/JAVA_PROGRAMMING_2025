public class Chapter13_TestCircle {
    public static void main(String[] args) {
        Chapter13_Circle3 circle1 = new Chapter13_Circle3(5);
        Chapter13_Circle3 circle2 = new Chapter13_Circle3(5);

        Chapter13_Circle3 circle3 = new Chapter13_Circle3(10);

        System.out.println("circle1 equals circle2: " + circle1.equals(circle2)); 
        System.out.println("circle1 equals circle3: " + circle1.equals(circle3)); 

        System.out.println("Comparing circle1 and circle2: " + circle1.compareTo(circle2)); 
        System.out.println("Comparing circle1 and circle3: " + circle1.compareTo(circle3));

        System.out.println("circle1: " + circle1);
        System.out.println("circle2: " + circle2);
        System.out.println("circle3: " + circle3);
    }
}
