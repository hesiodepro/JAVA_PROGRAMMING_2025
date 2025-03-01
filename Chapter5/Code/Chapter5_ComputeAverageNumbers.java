import java.util.Scanner;

public class Chapter5_ComputeAverageNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int positiveCount = 0;
        int negativeCount = 0;
        int total = 0;
        int count = 0;
        
        System.out.print("Enter an integer, the input ends if it is 0: ");
        
        while (true) {
            int num = input.nextInt();
            
            if (num == 0) {
                break;
            }
            
            if (num > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
            
            total += num;
            count++;
        }
        
        if (count == 0) {
            System.out.println("No numbers are entered except 0");
        } else {
            System.out.println("The number of positives is " + positiveCount);
            System.out.println("The number of negatives is " + negativeCount);
            System.out.println("The total is " + (double) total);
            System.out.printf("The average is %.2f\n", (double) total / count);
        }
    }
}
