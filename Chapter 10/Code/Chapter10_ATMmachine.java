import java.util.Scanner;

class Account {
    private int id;
    private double balance;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful.");
    }
}

public class Chapter10_ATMmachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] accounts = new Account[10];

        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100);
        }

        while (true) {
            System.out.print("Enter an account ID (0-9): ");
            int id = input.nextInt();

            while (id < 0 || id > 9) {
                System.out.print("Invalid ID. Enter again (0-9): ");
                id = input.nextInt();
            }

            Account currentAccount = accounts[id];

            while (true) {
                System.out.println("\nMain Menu");
                System.out.println("1: View Balance");
                System.out.println("2: Withdraw");
                System.out.println("3: Deposit");
                System.out.println("4: Exit");
                System.out.print("Enter a choice: ");
                int choice = input.nextInt();

                if (choice == 1) {
                    System.out.println("Current balance: $" + currentAccount.getBalance());
                } else if (choice == 2) {
                    System.out.print("Enter amount to withdraw: ");
                    double amount = input.nextDouble();
                    currentAccount.withdraw(amount);
                } else if (choice == 3) {
                    System.out.print("Enter amount to deposit: ");
                    double amount = input.nextDouble();
                    currentAccount.deposit(amount);
                } else if (choice == 4) {
                    System.out.println("Exiting to ID prompt...\n");
                    break;
                } else {
                    System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }
}
