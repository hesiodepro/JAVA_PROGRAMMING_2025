import java.util.Scanner;

public class Chapter8_ComputeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950},
            {16700, 67900, 137050, 208850, 372950},
            {8350, 33950, 68525, 104425, 186475},
            {11950, 45500, 117450, 190200, 372950}
        };
        
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        
        System.out.print("Enter filing status (0-single, 1-married jointly, 2-married separately, 3-head of household): ");
        int status = input.nextInt();
        
        System.out.print("Enter taxable income: ");
        double income = input.nextDouble();
        
        double tax = computeTax(brackets[status], rates, income);
        System.out.println("Tax is: " + tax);
    }
    
    public static double computeTax(int[] bracket, double[] rates, double income) {
        double tax = 0;
        int i;
        
        for (i = 0; i < bracket.length; i++) {
            if (income <= bracket[i]) {
                tax += income * rates[i];
                return tax;
            } else {
                tax += bracket[i] * rates[i];
                income -= bracket[i];
            }
        }
        
        tax += income * rates[i];
        return tax;
    }
}
