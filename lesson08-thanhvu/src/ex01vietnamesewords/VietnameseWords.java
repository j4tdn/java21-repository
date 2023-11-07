package ex01vietnamesewords;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class VietnameseWords {
	
	private static final Scanner ip = new Scanner(System.in);
	private static String pattern = "^[\\p{L}\\s]+$";  // ^[a-zA-ZÀ-ỹ\s]+$
	
	public static void main(String[] args) {
		System.out.println("Enter a string or character: ");
		String word = inputVietnameseWord();
		System.out.println("String --> " + word);
		
		System.out.println("\n1. Print each character in each line");
		printCharEachLine(word);
		
		System.out.println("\n2. Print each word in each line");
		printWordEachLine(word);
		
		System.out.println("\n3. Print reverse character");
		printReverseChar(word);
		
		System.out.println("\n4. Print reverse word");
		printReverseWord(word);
		
	}
	
	private static String inputVietnameseWord() {
		while(true) {
			String word = ip.nextLine();
			if(word.matches(pattern)) {			
				return word;
			} 
			System.err.println("Input wrong, please enter again!!!");
		}
	}
	
	private static void printCharEachLine(String word) {
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (c == ' ') {
				continue;
			}
			System.out.println(c);
		}
	}
	
	private static void printWordEachLine(String word) {
		String[] words = word.split("\\s+");
		for (String w : words) {
			System.out.println(w);
		}
	}
	
	private static void printReverseChar(String word) {
		StringBuilder reserverChar = new StringBuilder(word).reverse();
		System.out.println(reserverChar); 
		
//		for (int i = word.length() - 1; i >= 0; i--) {
//			char c = word.charAt(i);
//			System.out.print(c);
//		}
	}
	
	private static void printReverseWord(String word) {
		String[] words = word.split("\\s+");
		List<String> w = Arrays.asList(words);
		Collections.reverse(w);
		for (String s : w) {
			System.out.print(s + " ");
		}
		
//		String[] reversedWords = new String[words.length];
//        for (int i = 0; i < words.length; i++) {
//            System.out.print(words[words.length - 1 - i] + " ");
//        }
	}
}
