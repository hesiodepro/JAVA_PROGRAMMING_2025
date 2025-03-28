public class Chapter13_TestOctagon {
    public static void main(String[] args) {
        Chapter13_Octagon octagon1 = new Chapter13_Octagon(5);

        System.out.println("Area of octagon1: " + octagon1.getArea());
        System.out.println("Perimeter of octagon1: " + octagon1.getPerimeter());

        Chapter13_Octagon octagon2 = (Chapter13_Octagon) octagon1.clone();

        System.out.println("Area of octagon2 (cloned): " + octagon2.getArea());
        System.out.println("Perimeter of octagon2 (cloned): " + octagon2.getPerimeter());

        System.out.println("Comparison of octagon1 and octagon2: " + octagon1.compareTo(octagon2));

        System.out.println("octagon1: " + octagon1);
        System.out.println("octagon2: " + octagon2);
    }
}
