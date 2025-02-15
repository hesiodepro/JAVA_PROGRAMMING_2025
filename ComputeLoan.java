import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Enter annual interest rate in percentage 
        System.out.println("Enter anual interest rate e.g,7.25: ");
        double annualInterestRate = input.nextDouble();
        
        //Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;
        
        //Enter number of years
        System.out.println("Enter number of years as integers e.g, 5: ");
        int numberOfYears = input.nextInt();
        
        //Enter Loan amount
        System.out.println("Enter Loan Amount e.g, 120000.95: ");
        double loanAmount = input.nextDouble();
        
        //calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;
        
        //Display results
        System.out.println("The monthly payment is $: " + (int)(monthlyPayment * 100) / 100.0);
        
        System.out.println("The total payment is $: " + (int)(totalPayment * 100) / 100.0);
    }
}
