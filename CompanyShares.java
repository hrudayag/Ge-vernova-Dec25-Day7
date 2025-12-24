public class CompanyShares {
    String symbol;
    int numberOfShares;
    double sharePrice;
    String dateTime;
    CompanyShares(String symbol, int numberOfShares, double sharePrice, String dateTime) {
        this.symbol = symbol;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
        this.dateTime = dateTime;
    }
    double getValue() {
        return numberOfShares * sharePrice;
    }
}
