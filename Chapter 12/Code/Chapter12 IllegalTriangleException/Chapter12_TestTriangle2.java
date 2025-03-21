import java.util.Scanner;

public class Chapter12_TestTriangle2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side1: ");
        double side1 = input.nextDouble();

        System.out.print("Enter side2: ");
        double side2 = input.nextDouble();

        System.out.print("Enter side3: ");
        double side3 = input.nextDouble();

        try {
            Triangle2 triangle = new Triangle2(side1, side2, side3);
            System.out.println("The perimeter of the triangle is: " + triangle.getPerimeter());
        } catch (Chapter12_IllegalTriangleException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
