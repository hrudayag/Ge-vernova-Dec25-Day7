public class DeckOfCardsQueue {
    public static void main(String[] args) {
        Player[] players = {
                new Player("Player 1"),
                new Player("Player 2"),
                new Player("Player 3"),
                new Player("Player 4")
        };

        String[] cards = {
                "2H","3H","4H","5H","6H","7H","8H","9H","10H",
                "JH","QH","KH","AH"
        };

        int index = 0;
        for (Player p : players) {
            for (int i = 0; i < 3; i++) {
                p.addCard(cards[index++]);
            }
        }

        for (Player p : players) {
            p.showCards();
        }
    }
}
