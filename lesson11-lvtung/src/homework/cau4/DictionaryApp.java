package homework.cau4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import bean.Word;
import static utils.HomeworkUtils.*;

public class DictionaryApp {

	private static Map<String, Word> wordMap = new HashMap<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		wordMap.put("Cat", new Word("Cat", "con mèo", "noun", null));
		wordMap.put("Table", new Word("Table", "cái bàn", "noun", null));
		
		printAllWords();
		
		addWord();
		
		printAllWords();
		
		searchWord();
	}
	
	private static void printAllWords() {
        if (wordMap.isEmpty()) {
            System.err.println("Dictionary is empty.");
        } else {
            System.out.println("Printing all words in the dictionary:");
            for (Word word : wordMap.values()) {
                System.out.println("------------------------------------------------------------");
                System.out.println(word);
            }
            System.out.println("------------------------------------------------------------");
        }
    }

	private static void addWord() {
		System.out.print("Enter the word: ");
		String word = scanner.nextLine();
		System.out.print("Enter the meaning: ");
		String meaning = scanner.nextLine();
		System.out.print("Enter the word type: ");
		String wordType = scanner.nextLine();
		System.out.print("Enter any notes: ");
		String note = scanner.nextLine();

		wordMap.put(word.toLowerCase(), new Word(word, meaning, wordType, note));
		System.out.println("Word added successfully.");
	}
	
	private static void searchWord() {
		System.out.print("Enter the word to search: ");
		String searchWord = scanner.nextLine();
		Word foundWord = wordMap.get(searchWord.toLowerCase());
	
		if(foundWord != null) {
			System.out.println("Result --> " + foundWord);
		}else {
			System.err.println("Word not found in the dictionary.");
		}
	}

}
