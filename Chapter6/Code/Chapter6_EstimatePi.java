public class Chapter6_EstimatePi {
    public static void main(String[] args) {
        System.out.println("i       m(i)");
        for (int i = 1; i <= 9; i++) {
            int n = i * 100;  // i values 1, 2, ..., 9 correspond to 100, 200, ..., 900
            System.out.printf("%-8d%.4f\n", n, computePi(n));
        }
    }

    public static double computePi(int i) {
        double sum = 0.0;
        for (int j = 1; j <= i; j++) {
            sum += Math.pow(-1, j + 1) / (2 * j - 1);  // Apply the alternating series formula
        }
        return 4 * sum;  // Multiply by 4 to get the estimate of pi
    }
}
