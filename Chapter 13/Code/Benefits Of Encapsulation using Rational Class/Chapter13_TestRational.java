public class Chapter13_TestRational {
    public static void main(String[] args) {
        Chapter13_Rational r1 = new Chapter13_Rational(1, 2);
        Chapter13_Rational r2 = new Chapter13_Rational(2, 3);
        Chapter13_Rational r3 = new Chapter13_Rational(3, 4);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        Chapter13_Rational sum = r1.add(r2);
        System.out.println("r1 + r2 = " + sum);

        Chapter13_Rational difference = r1.subtract(r2);
        System.out.println("r1 - r2 = " + difference);

        Chapter13_Rational product = r1.multiply(r2);
        System.out.println("r1 * r2 = " + product);

        Chapter13_Rational quotient = r1.divide(r2);
        System.out.println("r1 / r2 = " + quotient);
    }
}
