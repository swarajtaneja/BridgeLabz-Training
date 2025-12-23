import java.util.Random;

public class CardDeckDistributor {

    public static String[] initializeDeck() {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[i * suits.length + j] = ranks[i] + " of " + suits[j];
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + rand.nextInt(n - i);

            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int x) {
        int n = deck.length;

        if (n % x != 0) {
            System.out.println("Error: Cannot distribute " + n + " cards evenly to " + x + " players.");
            return null;
        }

        int cardsPerPlayer = n / x;
        String[][] players = new String[x][cardsPerPlayer];

        for (int i = 0; i < n; i++) {
            int playerIndex = i % x;
            int cardIndex = i / x;
            players[playerIndex][cardIndex] = deck[i];
        }
        return players;
    }

    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("\n*** Player " + (i + 1) + " Cards: ***");
            for (String card : players[i]) {
                System.out.println("* " + card);
            }
        }
    }

    public static void main(String[] args) {
        int numOfPlayers = 4;

        String[] deck = initializeDeck();
        System.out.println("Deck Initialized with " + deck.length + " cards.");

        shuffleDeck(deck);
        System.out.println("Deck Shuffled.");

        String[][] players = distributeCards(deck, numOfPlayers);

        if (players != null) {
            printPlayersCards(players);
        }
    }
}
