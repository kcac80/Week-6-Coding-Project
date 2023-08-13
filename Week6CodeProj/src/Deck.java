import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

		    private List<Card> cards;

		    public Deck() {
		        cards = new ArrayList<>();
		        for (int value = 2; value <= 14; value++) {
		            for (String suit : new String[]{"Hearts", "Diamonds", "Clubs", "Spades"}) {
		                Card card = new Card();
		                card.setValue(value);
		                card.setName(getCardName(value, suit));
		                cards.add(card);
		            }
		        }
		    }

			private String getCardName(int value, String suit) {
				return null;
			}
public void shuffle() {
	Random rand = new Random();
for(int i =0; i<cards.size();i++) {
	int j =rand.nextInt(cards.size());
	Card temp = cards.get(i);
	cards.set(i,  cards.get(j));
	cards.set(j, temp);
}
}
public Card draw() {
	if(!cards.isEmpty()) {
		return cards.remove(0);
	}
	return null;
	
}
private String getCardName1(int value, String suit) {
	if(value >=2 && value <= 10) {
		return value + "of" +suit;
	}else if (value ==11) {
	return "Jack of " + suit;
	}else if (value ==12) {
		return "Queen of " + suit;
	}else if (value ==13) {
	return "King of " + suit;
	}else if (value ==14) {
		return "Ace of " + suit;
	}
	return "";
	
	}

}

