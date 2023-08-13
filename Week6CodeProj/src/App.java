
public class App {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        deck.shuffle();

        for (int i = 0; i < 52; i++) {
            player1.draw(deck);
            player2.draw(deck);
        }

        for (int i = 0; i < 26; i++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            card1.describe();
            card2.describe();

            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println("Player 1 wins this round.");
            } else if (card1.getValue() < card2.getValue()) {
                player2.incrementScore();
                System.out.println("Player 2 wins this round.");
            } else {
                System.out.println("It's a draw.");
            }
        }

        int score1 = player1.getScore();
        int score2 = player2.getScore();

        System.out.println("Final Score - Player 1: " + score1 + ", Player 2: " + score2);

        if (score1 > score2) {
            System.out.println("Player 1 wins!");
        } else if (score1 < score2) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a draw.");
        }
    }
} 
