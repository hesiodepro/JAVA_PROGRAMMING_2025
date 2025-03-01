
public class Chapter5_KiloToPounds{
    public static void main(String[] args) {
        System.out.println("Kilograms    Pounds");
        for (int kg = 1; kg <= 199; kg += 2) {
            System.out.printf("%-12d %.1f\n", kg, kg * 2.2);
        }
    }
}
