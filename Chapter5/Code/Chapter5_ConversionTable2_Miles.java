
public class Chapter5_ConversionTable2_Miles {
    public static void main(String[] args) {
        System.out.println("Miles   Kilometers   |   Kilometers   Miles");
        for (int miles = 1, km = 20; miles <= 10; miles++, km += 5) {
            System.out.printf("%-7d %-12.3f |   %-10d %.3f\n", miles, miles * 1.609, km, km / 1.609);
        }
    }
}
