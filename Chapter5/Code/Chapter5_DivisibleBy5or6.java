
public class Chapter5_DivisibleBy5or6 {
    public static void main(String[] args) {
        int count = 0;
        
        for (int num = 100; num <= 200; num++) {
            if ((num % 5 == 0) ^ (num % 6 == 0)) {
                System.out.print(num + " ");
                count++;
                
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
