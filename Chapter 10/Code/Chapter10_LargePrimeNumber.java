public class Chapter10_LargePrimeNumber {
    public static void main(String[] args) {
        long limit = Long.MAX_VALUE;
        long number = limit + 1;
        int count = 0;

        while (count < 5) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(long number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (long i = 3; i * i <= number; i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
