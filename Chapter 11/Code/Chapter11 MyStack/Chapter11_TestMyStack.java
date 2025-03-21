import java.util.Scanner;

public class Chapter11_TestMyStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Chapter11_MyStack stack = new Chapter11_MyStack();
        
        System.out.println("Enter 5 strings:");

        for (int i = 0; i < 5; i++) {
            String str = input.nextLine();
            stack.push(str);
        }

        System.out.println("Strings in reverse order:");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
