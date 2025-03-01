public class Chapter6_SumSeries {
    public static void main(String[] args) {
        System.out.println("i       m(i)");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-8d%.4f\n", i, computeSum(i));
        }
    }

    public static double computeSum(int i) {
        double sum = 0.0;
        for (int j = 1; j <= i; j++) {
            sum += (double) j / (j + 1);
        }
        return sum;
    }
}
