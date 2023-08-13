import java.util.List;
import java.util.ArrayList;

public class Player {


		private List<Card> hand;
	    private int score;
	    private String name;

	    public Player(String name) {
	        this.name = name;
	        hand = new ArrayList<>();
	        score = 0;
	    }

	    public void describe() {
	        System.out.println("Player: " + name + " (Score: " + score + ")");
	        for (Card card : hand) {
	            card.describe();
	        }
	    } 

	    public Card flip() {
	        if (!hand.isEmpty()) {
	            return hand.remove(0);
	        }
	        return null;
	    }
	
	    public void draw(Deck deck) {
	        Card card = deck.draw();
	        if (card != null) {
	            hand.add(card);
	        }
}
public void incrementScore() {
	score++;
	}
public int getScore() {
	return score;
}
}
