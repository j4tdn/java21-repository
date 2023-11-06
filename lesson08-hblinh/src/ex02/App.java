package ex02;

import java.util.Arrays;
import java.util.Scanner;

import view.InvalidInputValidation;

public class App {
	static String resultString1 = "";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		boolean validString = false;
		while (!validString) {
			try {
				System.out.println(" Nhập chuỗi tiếng Việt không dấu:  ");
				input = sc.nextLine();
				isValidString(input, " Vui lòng nhập lại ! ");
				validString = true;
			} catch (InvalidInputValidation e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		splitAndUpcase(input);
	}
	private static void isValidString(String text, String message) throws InvalidInputValidation {
		String pattern = "^[A-Za-z\\s]+$";

		if (!text.matches(pattern)) {
			throw new InvalidInputValidation(message);
		}
	}
	public static void splitAndUpcase(String input) {
		input = input.toLowerCase();
		String[] inputs = input.split("\\s");
		for(int i = 0; i < inputs.length; i++) {
			
			char char1 = inputs[i].charAt(0);
			char ch1 = Character.toUpperCase(char1);
			String repaceString = inputs[i].replace(char1, ch1);
			resultString1 += repaceString+" ";	
		}
		System.out.println(resultString1);
	}
}
