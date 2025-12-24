import java.util.Scanner;
public class StockPortfolio {

    Stock[] stocks;
    int count;

    StockPortfolio(int n) {
        stocks = new Stock[n];
        count = 0;
    }

    void addStock(Stock stock) {
        stocks[count++] = stock;
    }

    void printReport() {
        double totalValue = 0;

        System.out.println("\nStock Report:");
        for (int i = 0; i < count; i++) {
            double value = stocks[i].getStockValue();
            totalValue += value;
            System.out.println(stocks[i].name + " Value = " + value);
        }
        System.out.println("Total Stock Value = " + totalValue);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stocks: ");
        int n = sc.nextInt();

        StockPortfolio portfolio = new StockPortfolio(n);

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Stock Name: ");
            String name = sc.next();

            System.out.print("Enter Number of Shares: ");
            int shares = sc.nextInt();

            System.out.print("Enter Share Price: ");
            double price = sc.nextDouble();

            portfolio.addStock(new Stock(name, shares, price));
        }

        portfolio.printReport();
    }
}
