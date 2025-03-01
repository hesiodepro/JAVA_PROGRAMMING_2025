
public class Chapter6_ConversionFeet_Meters {
    public static void main(String[] args) {
        System.out.println("Feet     Meters | Meters    Feet");
        for (double feet = 1.0; feet <= 10.0; feet++) {
            double meters = footToMeter(feet);
            double meters2 = 20.0 + (feet - 1) * 5;
            double feet2 = meterToFoot(meters2);
            System.out.printf("%-8.1f%-8.3f | %-8.1f%-8.3f\n", feet, meters, meters2, feet2);
        }
    }

    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}
