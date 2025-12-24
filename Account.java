public class Account {

    private double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance");
        } else {
            balance -= amount;
        }
    }
    double getBalance() {
        return balance;
    }
}
