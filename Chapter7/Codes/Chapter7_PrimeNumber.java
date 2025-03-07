
public class Chapter7_PrimeNumber {
    public static void main(String[] args) {
        int[] primes = new int[50];
        int count = 0;
        int number = 2;

        while (count < 50) {
            boolean isPrime = true;
            int sqrt = (int) Math.sqrt(number);

            for (int i = 0; i < count && primes[i] <= sqrt; i++) {
                if (number % primes[i] == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes[count++] = number;
            }

            number++;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(primes[i] + (i % 10 == 9 ? "\n" : " "));
        }
    }
}
