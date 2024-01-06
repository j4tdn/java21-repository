package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.Card;

public class Ex03 {

	public static void main(String[] args) {
		var cards = createCards();
		
		System.out.println("---DistributteCard---");
		
		distribution(cards);
		
	}
	
	private static List<Card> createCards(){
		var cards = new ArrayList<Card>(52);
		String[] typeCard = {"Cơ", "Rô", "Chuồn", "Bích"};
		String[] rankCard = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		
		for(String type:typeCard) {
			for(String rank:rankCard) {
				cards.add(new Card(type, rank));
			}
		}
		return cards;
	}
	
	private static void distribution(List<Card> cards){
		Collections.shuffle(cards);
		
		for(int i = 0; i < 4; i++) {
			var hand = new ArrayList<Card>();
			for(Card card: cards.subList(0, 13)) {
				hand.add(card);
			}
			System.out.println("Player " + (i+1) + " " + hand );
			cards.removeAll(hand);
		}
	}
}