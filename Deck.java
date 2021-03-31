import java.util.ArrayList;

public class Deck {
	
        private String[] typeOfCard;
	private ArrayList<Card> cards;
	
	Deck () {
		int cardId;
		typeOfCard = new String[]{ "Infantry", "Cavalry", "Artillery"};
		cards = new ArrayList<Card>();
		for (cardId=0; cardId<GameData.NUM_COUNTRIES; cardId++) {
			cards.add(new Card(cardId, GameData.COUNTRY_NAMES[cardId]));
		}
		Collections.shuffle(cards);
	}
	
	public Card getCard () {
		int index = (int)(Math.random() * cards.size());  
		Card card = cards.remove(index);
		return card;
	}
	public void addCard(Card card){
        cards.add(card);
    }
	
	
	public boolean isEmpty () {
		return cards.isEmpty();
	}
	 public void shuffleCards(){
        Collections.shuffle(cards);
    }
}
