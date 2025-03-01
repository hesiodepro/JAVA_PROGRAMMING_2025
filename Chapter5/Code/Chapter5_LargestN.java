public class Chapter5_LargestN {
    public static void main(String[] args) {
        int n = 1;
        
        while ((n + 1) * (n + 1) * (n + 1) < 12000) {
            n++;
        }
        
        System.out.println(n);
    }
}
