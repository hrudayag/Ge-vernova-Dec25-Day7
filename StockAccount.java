import java.time.LocalDateTime;
public class StockAccount {
    CompanyShares[] companies;
    int count;
    StockAccount(String filename) {
        companies = new CompanyShares[10];
        count = 0;
        System.out.println("Stock account created from file: " + filename);
    }
    double valueOf() {
        double totalValue = 0;
        for (int i = 0; i < count; i++) {
            totalValue += companies[i].getValue();
        }
        return totalValue;
    }
    void buy(int amount, String symbol) {
        double price = 100;
        companies[count++] =
                new CompanyShares(symbol, amount, price, LocalDateTime.now().toString());

        System.out.println("Bought " + amount + " shares of " + symbol);
    }
    void sell(int amount, String symbol) {
        for (int i = 0; i < count; i++) {
            if (companies[i].symbol.equals(symbol)) {
                if (companies[i].numberOfShares >= amount) {
                    companies[i].numberOfShares -= amount;
                    companies[i].dateTime = LocalDateTime.now().toString();
                    System.out.println("Sold " + amount + " shares of " + symbol);
                } else {
                    System.out.println("Not enough shares to sell");
                }
                return;
            }
        }
        System.out.println("Stock not found");
    }
    void save(String filename) {
        System.out.println("Account details saved to file: " + filename);
    }
    void printReport() {
        System.out.println("\nStock Report:");
        for (int i = 0; i < count; i++) {
            System.out.println(
                    "Symbol: " + companies[i].symbol +
                            ", Shares: " + companies[i].numberOfShares +
                            ", Value: " + companies[i].getValue() +
                            ", Date: " + companies[i].dateTime
            );
        }
        System.out.println("Total Account Value: " + valueOf());
    }
    public static void main(String[] args) {
        StockAccount account = new StockAccount("stock.txt");
        account.buy(10, "TCS");
        account.buy(40, "INFY");
        account.sell(30, "TCS");
        account.printReport();
        account.save("stock.txt");
    }
}