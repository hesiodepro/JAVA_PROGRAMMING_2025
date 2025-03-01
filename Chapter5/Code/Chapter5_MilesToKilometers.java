public class Chapter5_MilesToKilometers {
    public static void main(String[] args) {
        System.out.println("Miles    Kilometers");
        for (int miles = 1; miles <= 10; miles++) {
            System.out.printf("%-8d %.3f\n", miles, miles * 1.609);
        }
    }
}
