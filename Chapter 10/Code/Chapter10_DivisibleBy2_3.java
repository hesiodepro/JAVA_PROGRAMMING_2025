import java.math.BigInteger;

public class Chapter10_DivisibleBy2_3 {
    public static void main(String[] args) {
        int count = 0;
        BigInteger number = new BigInteger("10").pow(49); 

        while (count < 10) {
            if (number.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO) || number.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO)) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
}
