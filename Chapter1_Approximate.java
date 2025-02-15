public class Chapter1_Approximate {
    public static void main(String[] args) {
        
        double PI = 4 * (1.0 - (1.0/3) + (1.0/5) + (1.0/7) + (1.0/9) + (1.0/11));
        double PII = 4 * (1.0 - (1.0/3) + (1.0/5) + (1.0/7) + (1.0/9) + (1.0/11) + (1.0/13));
      
        System.out.println("The result is " + PI + " AND " + PII);
    }
}
