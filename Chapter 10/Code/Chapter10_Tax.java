class Tax {
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax() {
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        double tax = 0;
        double income = taxableIncome;
        int[] bracket = brackets[filingStatus];

        for (int i = rates.length - 1; i >= 0; i--) {
            if (income > bracket[i]) {
                tax += (income - bracket[i]) * rates[i];
                income = bracket[i];
            }
        }
        return tax;
    }
}

public class Chapter10_Tax {
    public static void main(String[] args) {
        double[] rates2001 = {0.15, 0.275, 0.305, 0.355, 0.391};
        int[][] brackets2001 = {
            {27050, 65550, 136750, 297350, Integer.MAX_VALUE},
            {45200, 109250, 166500, 297350, Integer.MAX_VALUE},
            {22600, 54625, 83250, 148675, Integer.MAX_VALUE}, 
            {36250, 93650, 151650, 297350, Integer.MAX_VALUE}  
        };

        double[] rates2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets2009 = {
            {8350, 33950, 82250, 171550, 372950, Integer.MAX_VALUE}, 
            {16700, 67900, 137050, 208850, 372950, Integer.MAX_VALUE}, 
            {8350, 33950, 68525, 104425, 186475, Integer.MAX_VALUE}, 
            {11950, 45500, 117450, 190200, 372950, Integer.MAX_VALUE}  
        };

        System.out.println("2001 Tax Table:");
        printTaxTable(brackets2001, rates2001);
        System.out.println("\n2009 Tax Table:");
        printTaxTable(brackets2009, rates2009);
    }

    public static void printTaxTable(int[][] brackets, double[] rates) {
        System.out.println("Income\tSingle\tMarried Joint\tMarried Separate\tHead of Household");
        for (int income = 50000; income <= 60000; income += 1000) {
            System.out.print(income + "\t");
            for (int status = 0; status < 4; status++) {
                Tax tax = new Tax(status, brackets, rates, income);
                System.out.printf("%.2f\t\t", tax.getTax());
            }
            System.out.println();
        }
    }
}
