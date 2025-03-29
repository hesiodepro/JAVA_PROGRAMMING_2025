public class Chapter13_Rational {
    private long[] r = new long[2]; // r[0] represents numerator, r[1] represents denominator

    public Chapter13_Rational(long numerator, long denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        r[0] = numerator;
        r[1] = denominator;
        reduce();
    }

    public long getNumerator() {
        return r[0];
    }

    public long getDenominator() {
        return r[1];
    }

    public Chapter13_Rational add(Chapter13_Rational other) {
        long numerator = r[0] * other.getDenominator() + r[1] * other.getNumerator();
        long denominator = r[1] * other.getDenominator();
        return new Chapter13_Rational(numerator, denominator);
    }

    public Chapter13_Rational subtract(Chapter13_Rational other) {
        long numerator = r[0] * other.getDenominator() - r[1] * other.getNumerator();
        long denominator = r[1] * other.getDenominator();
        return new Chapter13_Rational(numerator, denominator);
    }

    public Chapter13_Rational multiply(Chapter13_Rational other) {
        long numerator = r[0] * other.getNumerator();
        long denominator = r[1] * other.getDenominator();
        return new Chapter13_Rational(numerator, denominator);
    }

    public Chapter13_Rational divide(Chapter13_Rational other) {
        if (other.getNumerator() == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        long numerator = r[0] * other.getDenominator();
        long denominator = r[1] * other.getNumerator();
        return new Chapter13_Rational(numerator, denominator);
    }

    private void reduce() {
        long gcd = gcd(r[0], r[1]);
        r[0] /= gcd;
        r[1] /= gcd;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public String toString() {
        return r[0] + "/" + r[1];
    }
}
