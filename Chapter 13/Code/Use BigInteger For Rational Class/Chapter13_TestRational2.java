import java.util.Scanner;

public class Chapter13_TestRational2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first rational number (numerator denominator): ");
        long num1 = input.nextLong();
        long denom1 = input.nextLong();

        System.out.print("Enter the second rational number (numerator denominator): ");
        long num2 = input.nextLong();
        long denom2 = input.nextLong();

        Chapter13_Rational2 r1 = new Chapter13_Rational2(num1, denom1);
        Chapter13_Rational2 r2 = new Chapter13_Rational2(num2, denom2);

        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
