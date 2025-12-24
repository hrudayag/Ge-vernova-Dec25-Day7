public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(10000);

        account.debit(2000);
        System.out.println("Balance: " + account.getBalance());

        account.debit(4000);
        System.out.println("Balance: " + account.getBalance());
    }
}
