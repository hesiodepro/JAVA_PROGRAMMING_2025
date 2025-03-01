public class Chapter5_SmallestN {
    public static void main(String[] args) {
        int n = 1;
        
        while (n * n <= 12000) {
            n++;
        }
        
        System.out.println(n);
    }
}
