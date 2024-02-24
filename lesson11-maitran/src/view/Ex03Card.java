package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bean.Card;

public class Ex03Card {
	public static void main(String[] args) {
		Set<Card> setCard = generate();
//		System.out.print(setCard);
//		System.out.println("\nSize: " + setCard.size());
		List<Card> shuffledCards = shuffle(setCard);
		List<List<Card>> players = distributeCard(shuffledCards, 4);
		display(players);
	}

	private static Set<Card> generate() {
		Set<Card> setCard = new HashSet<>();
		String[] types = { "Cơ", "Rô", "Chuồn", "Bích" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

		for (String type : types) {
			for (String rank : ranks) {
				setCard.add(new Card(type, rank));
			}
		}
		return setCard;
	}

	private static List<Card> shuffle(Set<Card> setCard) {
		List<Card> listCard = new ArrayList<>(setCard);
		Collections.shuffle(listCard);
		return listCard;
	}

	private static List<List<Card>> distributeCard(List<Card> shuffledCard, int numberOfPlayers) {
		List<List<Card>> players = new ArrayList<>();

		for (int i = 0; i < numberOfPlayers; i++) {
			players.add(new ArrayList<>());
		}

		int currentPlayer = 0;
		for (Card card : shuffledCard) {
			players.get(currentPlayer).add(card);
			currentPlayer = (currentPlayer + 1) % numberOfPlayers;
		}
		return players;
	}

	private static void display(List<List<Card>> players) {
		for (int i = 0; i < players.size(); i++) {
			System.out.println("Player " + (i + 1) + " " + players.get(i));
		}
	}

}
