package ex02inputfullname;

import java.util.Scanner;

public class FullNameFormat {
	
	private static final Scanner ip = new Scanner(System.in);
	private static String pattern = "^[A-Za-z\s]+$";
	
	public static void main(String[] args) {
		System.out.println("Enter full name: ");
		String fullName = inputFullName();
		System.out.println("Full name: " + fullName);
		String formatName = formatFullName(fullName);
		StringBuilder formatName1 = formatFullName1(fullName);
		System.out.println("formatName --> " + formatName);
		System.out.println("formatName1 --> " + formatName1);
	}
	
	public static String inputFullName() {
		while(true) {
			String result = ip.nextLine();
			if(result.matches(pattern)) {
				return result;
			}
			System.err.println("Wrong format, please enter again!!!");
		}
	}
	
	public static String formatFullName(String fullName) {
		String[] words = fullName.split("\\s+");
		String name = "";
		String formatFullName = "";
		for (String word : words) {
			char firstChar = word.charAt(0);
			if(Character.isLowerCase(firstChar)) {
				firstChar = Character.toUpperCase(firstChar);
			}
			name = name + firstChar;
			firstChar = ' ';
			for (int i = 1; i < word.length(); i++) {
				char c = word.charAt(i);
				if(Character.isUpperCase(c)) {
					c = Character.toLowerCase(c);
				}
				name = name + c;
				c = ' ';
			}
			formatFullName += name + " ";
			name = "";
		}
		return formatFullName;
	}
	
	public static StringBuilder formatFullName1(String fullName) {
		StringBuilder result = new StringBuilder();
		fullName = fullName.toLowerCase();
		String[] words = fullName.split("\\s+");
		for (String word : words) {
			if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    result.append(word.substring(1));
                }
                result.append(" ");
            }
		}
		return result;
	}
}
