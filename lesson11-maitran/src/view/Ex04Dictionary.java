package view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import bean.Word;

public class Ex04Dictionary {
	private static Scanner sc = new Scanner(System.in);

	private static final Map<String, Word> words = new HashMap<>();

	public static void main(String[] args) {
		runDic();
	}

	private static void addWord() {
		System.out.print("Enter word: ");
		String addWord = sc.nextLine();
		System.out.print("Enter meaning: ");
		String meaning = sc.nextLine();
		System.out.print("Enter type: ");
		String type = sc.nextLine();
		System.out.print("Enter note: ");
		String note = sc.nextLine();

		words.put(addWord.toLowerCase(), new Word(addWord, meaning, type, note));
		System.out.println("Added Successfully!");
	}

	private static void search() {
		System.out.println("Enter word you wanna search: ");
		String searchWord = sc.nextLine();
		Word foundW = words.get(searchWord.toLowerCase());
		if (foundW != null) {
			System.out.println(foundW);
		} else {
			System.out.println("Not Found!");
		}
	}

	public static void runDic() {
		while (true) {
			System.out.println("\n-----Dictionary-----");
			System.out.println("1. Add New Word");
			System.out.println("2. Search Word");
			System.out.println("3. Exit");
			System.out.print("Choose an option: ");

			int op = sc.nextInt();
			sc.nextLine();

			switch (op) {
			case 1:
				addWord();
				break;
			case 2:
				search();
				break;
			case 3:
				System.out.println("See you again!");
				sc.close();
				return;
			default:
				System.out.println("Invalid! Try again!");
				break;
			}
		}
	}

}
