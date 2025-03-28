import java.util.List;

public class Chapter13_TestMystack {
    public static void main(String[] args) {
        Chapter13_Mystack<Integer> stack1 = new Chapter13_Mystack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        
        Chapter13_Mystack<Integer> stack2 = stack1.deepCopy();
        
        stack1.push(4);
        
        System.out.println("Stack 1: " + stack1);
        System.out.println("Stack 2: " + stack2); 
    }
}
