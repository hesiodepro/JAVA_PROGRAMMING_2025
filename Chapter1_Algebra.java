
public class Chapter1_Algebra {
    public static void main (String[] args){
        double a = 3.4;
        double b = 50.2;
        double e = 44.5;
        double c = 2.1;
        double d = 0.55;
        double f = 5.9;
        
        // Calculate the denominator (ad - bc)
        double denominator = (a * d) - (b * c);
        
            // Calculate x and y using Cramer's rule
            double x = ((e * d) - (b * f)) / denominator;
            double y = ((a * f) - (e * c)) / denominator;
            
            // Display the result
            System.out.println("The value of x is: " + x);
            System.out.println("The value of y is: " + y);
       
    }
}
