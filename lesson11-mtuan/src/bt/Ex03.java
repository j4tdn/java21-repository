package bt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bt.Card.Type;

public class Ex03 {
	
	public static void main(String[] args) {
		List<Card> cards = mockCardsAfterShuffle();
		dealCards(cards);
	}

	
	private static void dealCards(List<Card> cards) {
		System.out.println("----Chia bài----");
		List<Card> player1 = new ArrayList<>();
		List<Card> player2 = new ArrayList<>();
		List<Card> player3 = new ArrayList<>();
		List<Card> player4 = new ArrayList<>();
		
		for(int i = 0; i< 52;i++) {
			int number = i % 4;
			
			switch (number) {
			case 0:
				player1.add(cards.get(i));
				break;
			case 1:
				player2.add(cards.get(i));
				break;
			case 2:
				player3.add(cards.get(i));
				break;
			case 3:
				player4.add(cards.get(i));
			}
		}
		
		System.out.println("****Bài người chơi 1****");
		show(player1);
		System.out.println("****Bài người chơi 2****");
		show(player2);
		System.out.println("****Bài người chơi 3****");
		show(player3);
		System.out.println("****Bài người chơi 4****");
		show(player4);
	}


	private static void show(List<Card> cards) {
		cards.forEach(card -> System.out.println(card));
	}

	@SuppressWarnings({ "rawtypes", "unchecked"})
	private static List<Card> mockCardsAfterShuffle() {
		List<Card> cards = new ArrayList<>();
		Card.Type[] types = {Type.CLUB, Type.DIAMOND, Type.HEART, Type.SPADE};
		int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10};
		String[] anothers = {"J", "Q", "K", "A"};

		for (Type type : types) {
			for (int number : numbers) {
				cards.add(new Card(type, number));
			}
			
			for (String character : anothers) {
				cards.add(new Card(type, character));
			}
		}
		
		Collections.shuffle(cards);
		return cards;
	}
}