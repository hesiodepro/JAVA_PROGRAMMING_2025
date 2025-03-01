
public class Chapter6_ComputeCommissions {
    public static void main(String[] args) {
        System.out.println("Sales Amount    Commission");
        for (double salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
            System.out.printf("%-15.0f%-10.1f\n", salesAmount, computeCommission(salesAmount));
        }
    }

    public static double computeCommission(double salesAmount) {
        if (salesAmount <= 10000) {
            return salesAmount * 0.09;
        } else if (salesAmount <= 20000) {
            return 10000 * 0.09 + (salesAmount - 10000) * 0.12;
        } else if (salesAmount <= 30000) {
            return 10000 * 0.09 + 10000 * 0.12 + (salesAmount - 20000) * 0.15;
        } else if (salesAmount <= 40000) {
            return 10000 * 0.09 + 10000 * 0.12 + 10000 * 0.15 + (salesAmount - 30000) * 0.18;
        } else if (salesAmount <= 50000) {
            return 10000 * 0.09 + 10000 * 0.12 + 10000 * 0.15 + 10000 * 0.18 + (salesAmount - 40000) * 0.21;
        } else if (salesAmount <= 60000) {
            return 10000 * 0.09 + 10000 * 0.12 + 10000 * 0.15 + 10000 * 0.18 + 10000 * 0.21 + (salesAmount - 50000) * 0.24;
        } else if (salesAmount <= 70000) {
            return 10000 * 0.09 + 10000 * 0.12 + 10000 * 0.15 + 10000 * 0.18 + 10000 * 0.21 + 10000 * 0.24 + (salesAmount - 60000) * 0.27;
        } else if (salesAmount <= 80000) {
            return 10000 * 0.09 + 10000 * 0.12 + 10000 * 0.15 + 10000 * 0.18 + 10000 * 0.21 + 10000 * 0.24 + 10000 * 0.27 + (salesAmount - 70000) * 0.30;
        } else if (salesAmount <= 90000) {
            return 10000 * 0.09 + 10000 * 0.12 + 10000 * 0.15 + 10000 * 0.18 + 10000 * 0.21 + 10000 * 0.24 + 10000 * 0.27 + 10000 * 0.30 + (salesAmount - 80000) * 0.33;
        } else {
            return 10000 * 0.09 + 10000 * 0.12 + 10000 * 0.15 + 10000 * 0.18 + 10000 * 0.21 + 10000 * 0.24 + 10000 * 0.27 + 10000 * 0.30 + 10000 * 0.33 + (salesAmount - 90000) * 0.36;
        }
    }
}
