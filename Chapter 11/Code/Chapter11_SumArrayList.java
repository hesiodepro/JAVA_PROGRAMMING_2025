import java.util.ArrayList;
import java.util.Scanner;

public class Chapter11_SumArrayList {
    public static double sum(ArrayList<Double> list) {
        double total = 0;
        for (double num : list) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }

        double total = sum(list);
        System.out.println("The sum of the numbers is: " + total);
    }
}
