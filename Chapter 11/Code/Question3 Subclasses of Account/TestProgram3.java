public class TestProgram3 {
    public static void main(String[] args) {
        Account account = new Account(1, 1000, 5.0);
        CheckingAccount checkingAccount = new CheckingAccount(2, 500, 3.0, 200);
        SavingsAccount savingsAccount = new SavingsAccount(3, 1500, 4.0);

        account.deposit(200);
        checkingAccount.deposit(100);
        savingsAccount.deposit(300);

        account.withdraw(50);
        checkingAccount.withdraw(600);
        savingsAccount.withdraw(100);

        System.out.println(account.toString());
        System.out.println(checkingAccount.toString());
        System.out.println(savingsAccount.toString());
    }
}
