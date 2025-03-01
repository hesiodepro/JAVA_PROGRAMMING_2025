public class Chapter5_ConversionTable {
    public static void main(String[] args) {
        System.out.println("Kilograms   Pounds   |   Pounds   Kilograms");
        for (int kg = 1, lb = 20; kg <= 199; kg += 2, lb += 5) {
            System.out.printf("%-10d %-8.1f |   %-8d %.2f\n", kg, kg * 2.2, lb, lb / 2.2);
        }
    }
}
