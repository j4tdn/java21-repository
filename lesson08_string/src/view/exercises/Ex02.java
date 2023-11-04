package view.exercises;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		
		do {
			System.out.print("Enter string: ");
			s = sc.nextLine();
			if (!Ex01.checkString(s)) {
				System.out.println("---Error---");
			}
		} while (!Ex01.checkString(s));
		sc.close();
		
//		do {
//			System.out.println("Enter string: ");
//			s = sc.nextLine();
//			if(!s.matches("[a-zA-Z ]+")) {
//				System.out.println("Please enter string again!!!");
//			}
//			
//		} while (true);
		StringBuilder sb = new StringBuilder();
		
		String[] words = s.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
			sb.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1).toLowerCase()).append(" ");
		}
		
		System.out.println(sb);
		
//		String result = "";
//		for (int i = 0; i < words.length; i++) {
//			result += words[i] + " ";
//		}
//		System.out.println("Correct name: " + result);
	}
}
