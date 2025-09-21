package strings.level3;

import java.util.Scanner;

public class DeckOfCards {

    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomIndex = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
        return deck;
    }

    public static String[][] distributeDeck(String[] deck, int numCards, int numPlayers) {
        if (numCards > deck.length) {
            System.out.println("Cannot distribute more cards than available in deck.");
            return null;
        }
        if (numCards % numPlayers != 0) {
            System.out.println("Cannot distribute cards evenly to players.");
            return null;
        }

        String[][] players = new String[numPlayers][numCards / numPlayers];
        int cardIndex = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < numCards / numPlayers; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    public static void printPlayersCards(String[][] players) {
        if (players == null) return;
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : players[i]) {
                System.out.print(card + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int numPlayers = sc.nextInt();
        System.out.print("Enter number of cards to distribute: ");
        int numCards = sc.nextInt();

        String[][] players = distributeDeck(deck, numCards, numPlayers);
        printPlayersCards(players);
    }
}

