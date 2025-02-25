import java.util.Scanner;

public class Chapter4_CornerPointCoordinates {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();
        
        System.out.println("The coordinates of five points on the pentagon are:");
        for (int i = 0; i < 5; i++) {
            
            double angle = Math.toRadians(72 * i);
            
            double x = radius * Math.cos(angle);
            double y = radius * Math.sin(angle);
            
            System.out.printf("(%.2f, %.2f)\n", x, y);
        }
    }
}
