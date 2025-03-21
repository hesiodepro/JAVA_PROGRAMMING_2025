import java.util.ArrayList;
import java.util.Date;

class Loan {
    private double amount;
    private double interestRate;
    
    public Loan(double amount, double interestRate) {
        this.amount = amount;
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "Loan [Amount: " + amount + ", Interest Rate: " + interestRate + "]";
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [Radius: " + radius + "]";
    }
}

public class Chapter11_UseArrayList {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        
        Loan loan = new Loan(10000, 5.5);
        Date date = new Date();
        String str = "Jesus Is King";
        Circle circle = new Circle(7.5);

        list.add(loan);
        list.add(date);
        list.add(str);
        list.add(circle);

        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }
}
