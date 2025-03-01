import java.util.Scanner;

public class Chapter6_FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the investment amount: ");
        double investmentAmount = input.nextDouble();
        
        System.out.print("Enter the annual interest rate (e.g., 9 for 9%): ");
        double annualInterestRate = input.nextDouble();
        
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        
        System.out.println("Years     Future Value");
        for (int years = 1; years <= 30; years++) {
            System.out.printf("%-10d%-15.2f\n", years, futureInvestmentValue(investmentAmount, monthlyInterestRate, years));
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
