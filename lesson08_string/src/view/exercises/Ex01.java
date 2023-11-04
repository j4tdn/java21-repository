package view.exercises;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s;
		
		do {
			System.out.print("Enter string: ");
			s = sc.nextLine();
			if (!checkString(s)) {
				System.out.println("---Error---");
			}
		} while (!checkString(s));
		sc.close();
		
		
		
		s = s.strip().replaceAll("\\s+", " ");
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			System.out.println(c + " ");
		}
		
		System.out.println("");
		
		String[] tokens = s.strip().split("\\s+");
		for(String token:tokens) {
			System.out.println(token);
		}
		
		System.out.println("");

		String reversed = "";
		for(int i = s.length()-1; i >= 0; i--) {
			reversed += s.charAt(i);
		}
		System.out.println("Print reverse by character: " + reversed);
		
		String[] tokens2 = reversed.split("\\s+");
		for(String token:tokens2) {
			System.out.println("Print reverse by letter: " + token);
		}
	}
	
	public static boolean checkString(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
}
