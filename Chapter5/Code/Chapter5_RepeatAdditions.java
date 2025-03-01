import java.util.Scanner;

public class Chapter5_RepeatAdditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correctCount = 0;
        long startTime = System.currentTimeMillis();
        int count = 0;
        final int NUMBER_OF_QUESTIONS = 10;
        
        while (count < NUMBER_OF_QUESTIONS) {
            int number1 = 1 + (int)(Math.random() * 15);
            int number2 = 1 + (int)(Math.random() * 15);
            System.out.print("What is " + number1 + " + " + number2 + "? ");
            int answer = input.nextInt();
            if (number1 + number2 == answer) {
                correctCount++;
            }
            count++;
        }
        
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        
        System.out.println("Correct count is " + correctCount);
        System.out.println("Test time is " + testTime / 1000 + " seconds");
        
    }
}
