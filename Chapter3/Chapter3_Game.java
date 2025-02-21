import java.util.Scanner;

public class Chapter3_Game {
    public static void main (String[] args){
        
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is: " + number1 + " + " + number2 + " + " + number3 + " ? ");
        
        int answer = input.nextInt();
        
        if(answer == number1 + number2 + number3){
            System.out.println("The answer is correct!");
        }
        else{
            System.out.println("Sorry, The answer is incorrect" + " The correct answer is: " + (number1 + number2 + number3));
        }
        
        
    }
}
