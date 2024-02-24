package homework.cau3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static utils.HomeworkUtils.*;
import bean.Card;

public class CardApp {
	
	public static void main(String[] args) {
		List<Card> cards = createCard();
		
		generate("1. Tạo bài", cards);
		
        shuffleDeck(cards);

        List<Card> player1 = distributeCards(cards);
        List<Card> player2 = distributeCards(cards);
        List<Card> player3 = distributeCards(cards);
        List<Card> player4 = distributeCards(cards);

        generate("Player 1:", player1);
        generate("Player 2:", player2);
        generate("Player 3:", player3);
        generate("Player 4:", player4);
        
	}
	
	private static List<Card> createCard() {
		List<Card> cards = new ArrayList<>();
		String[] typeCards = {"cơ", "rô", "chuồn", "bích"};
        String[] levels = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        
        for(String typeCard: typeCards) {
        	for(String level : levels) {
        		cards.add(new Card(typeCard, level));
        	}
        }
        
        return cards;
	}
	
	// Xào bài
    private static void shuffleDeck(List<Card> cards) {
        Collections.shuffle(cards);
    }
    
    // chia bài
    private static List<Card> distributeCards(List<Card> cards){
    	List<Card> hand = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            hand.add(cards.remove(0));
        }
        return hand;
    }

}
