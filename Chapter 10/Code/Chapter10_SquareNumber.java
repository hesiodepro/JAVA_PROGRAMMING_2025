public class Chapter10_SquareNumber {
    public static void main(String[] args) {
        long limit = Long.MAX_VALUE;
        long n = (long) Math.sqrt(limit) + 1;

        int count = 0;
        while (count < 10) {
            long square = n * n;
            System.out.println(square);
            n++;
            count++;
        }
    }
}
