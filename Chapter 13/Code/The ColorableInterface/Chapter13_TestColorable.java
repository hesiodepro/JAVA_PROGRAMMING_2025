public class Chapter13_TestColorable {
    public static void main(String[] args) {
        
        Chapter13_GeometricObjects3[] objects = new Chapter13_GeometricObjects3[5];
        
        objects[0] = new Chapter13_Square(4);
        objects[1] = new Chapter13_Square(6);
        objects[2] = new Chapter13_Square();
        objects[3] = new Chapter13_Square(2);
        objects[4] = new Chapter13_Square(8);

        for (Chapter13_GeometricObjects3 obj : objects) {
            
            System.out.println("Area: " + obj.getArea());
            
            if (obj instanceof Chapter13_Colorable) {
                System.out.print("How to color: ");
                ((Chapter13_Colorable) obj).howToColor();
            }
            System.out.println();
        }
    }
}
