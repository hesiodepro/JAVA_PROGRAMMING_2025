import java.math.BigInteger;

public class Chapter13_Rational2 {
    private BigInteger numerator;
    private BigInteger denominator;

    public Chapter13_Rational2(long numerator, long denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = BigInteger.valueOf(numerator);
        this.denominator = BigInteger.valueOf(denominator);
        reduce();
    }

    public Chapter13_Rational2(BigInteger numerator, BigInteger denominator) {
        if (denominator.equals(BigInteger.ZERO)) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    public BigInteger getNumerator() {
        return numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }

    public Chapter13_Rational2 add(Chapter13_Rational2 other) {
        BigInteger newNumerator = numerator.multiply(other.getDenominator()).add(denominator.multiply(other.getNumerator()));
        BigInteger newDenominator = denominator.multiply(other.getDenominator());
        return new Chapter13_Rational2(newNumerator, newDenominator);
    }

    public Chapter13_Rational2 subtract(Chapter13_Rational2 other) {
        BigInteger newNumerator = numerator.multiply(other.getDenominator()).subtract(denominator.multiply(other.getNumerator()));
        BigInteger newDenominator = denominator.multiply(other.getDenominator());
        return new Chapter13_Rational2(newNumerator, newDenominator);
    }

    public Chapter13_Rational2 multiply(Chapter13_Rational2 other) {
        BigInteger newNumerator = numerator.multiply(other.getNumerator());
        BigInteger newDenominator = denominator.multiply(other.getDenominator());
        return new Chapter13_Rational2(newNumerator, newDenominator);
    }

    public Chapter13_Rational2 divide(Chapter13_Rational2 other) {
        if (other.getNumerator().equals(BigInteger.ZERO)) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        BigInteger newNumerator = numerator.multiply(other.getDenominator());
        BigInteger newDenominator = denominator.multiply(other.getNumerator());
        return new Chapter13_Rational2(newNumerator, newDenominator);
    }

    private void reduce() {
        BigInteger gcd = numerator.gcd(denominator);
        numerator = numerator.divide(gcd);
        denominator = denominator.divide(gcd);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public double doubleValue() {
        return numerator.doubleValue() / denominator.doubleValue();
    }
}
