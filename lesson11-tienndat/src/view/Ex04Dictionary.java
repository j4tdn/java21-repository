package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import bean.Word;

public class Ex04Dictionary {
	private Map<String, Word> wordMap;

	public Ex04Dictionary() {
		wordMap = new HashMap<>();
	}

	public void addWord(String word, String meaning, String wordType, String note) {
		Word newWord = new Word(word, meaning, wordType, note);
		wordMap.put(word.toLowerCase(), newWord);
		System.out.println("Word added to the dictionary.");
	}

	public void lookupWord(String word) {
		Word foundWord = wordMap.get(word.toLowerCase());
		if (foundWord != null) {
			System.out.println(foundWord);
		} else {
			System.out.println("Word not found in the dictionary.");
		}
	}

	public void mockData(List<Word> words) {
		for (Word word : words) {
			wordMap.put(word.getWord().toLowerCase(), word);
		}
		System.out.println("Mock data added to the dictionary.");
	}

	public void displayMenu() {
		System.out.println("Choose an option:");
		System.out.println("1. Add a new word");
		System.out.println("2. Look up a word");
		System.out.println("3. Exit");
	}

	public void processOption(int option, Scanner scanner) {
		switch (option) {
		case 1:
			System.out.println("Enter word:");
			String newWord = scanner.nextLine();
			System.out.println("Enter meaning:");
			String meaning = scanner.nextLine();
			System.out.println("Enter word type:");
			String wordType = scanner.nextLine();
			System.out.println("Enter note:");
			String note = scanner.nextLine();
			addWord(newWord, meaning, wordType, note);
			break;
		case 2:
			System.out.println("Enter word to look up:");
			String lookupWord = scanner.nextLine();
			lookupWord(lookupWord);
			break;
		case 3:
			System.out.println("Exiting program.");
			scanner.close();
			System.exit(0);
			break;
		default:
			System.out.println("Invalid choice. Please choose again.");
			break;
		}
	}

	public static void main(String[] args) {
		Ex04Dictionary dictionary = new Ex04Dictionary();
		Scanner scanner = new Scanner(System.in);

		// Mock data
		List<Word> mockWords = new ArrayList<>();
		mockWords.add(new Word("apple", "a fruit", "noun", "red and delicious"));
		mockWords.add(new Word("computer", "an electronic device", "noun", "used for processing data"));

		dictionary.mockData(mockWords);

		while (true) {
			dictionary.displayMenu();
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline
			dictionary.processOption(choice, scanner);
		}
	}
}