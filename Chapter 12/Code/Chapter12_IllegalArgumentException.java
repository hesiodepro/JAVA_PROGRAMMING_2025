public class Chapter12_IllegalArgumentException {
    private double amount;
    private double annualInterestRate;
    private int years;

    public Chapter12_IllegalArgumentException(double amount, double annualInterestRate, int years) {
        if (amount <= 0 || annualInterestRate <= 0 || years <= 0) {
            throw new IllegalArgumentException("Loan amount, interest rate, and years must be greater than zero.");
        }
        this.amount = amount;
        this.annualInterestRate = annualInterestRate;
        this.years = years;
    }

    public double getAmount() {
        return amount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getYears() {
        return years;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = getMonthlyInterestRate();
        return amount * monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -years * 12));
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * years * 12;
    }

    public static void main(String[] args) {
        try {
            Chapter12_IllegalArgumentException loan = new Chapter12_IllegalArgumentException(1000, 5.5, 10);
            System.out.println("Loan created successfully.");
            System.out.println("Monthly payment: " + loan.getMonthlyPayment());
            System.out.println("Total payment: " + loan.getTotalPayment());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
