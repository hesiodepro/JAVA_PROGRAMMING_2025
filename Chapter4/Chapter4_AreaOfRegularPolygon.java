import java.util.Scanner;

public class Chapter4_AreaOfRegularPolygon {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();
        
        System.out.print("Enter the side: ");
        double s = input.nextDouble();
        
        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
        
        System.out.printf("The area of the polygon is %.15f\n", area);
    }
}
