public class Player {
    String name;
    Queue cards = new Queue();

    Player(String name) {
        this.name = name;
    }

    void addCard(String card) {
        cards.enqueue(card);
    }

    void showCards() {
        System.out.println("\n" + name + "'s Cards:");
        cards.display();
    }
}
