import java.util.Scanner;

public class  Chapter3_Game2{
    public static void main(String[] args) {
        
        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        System.out.print("What is " + num1 + " + " + num2 + "? ");
        int answer = input.nextInt();

        if (answer == (num1 + num2)) {
            System.out.println("The answer is correct!");
        } else {
            System.out.println("Sorry, the answer is incorrect, the correct answer is " + (num1 + num2));
        }

    }
}
