package ex07;

import java.util.Scanner;

import view.InvalidInputValidation;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean validString = false;
		String input = "";
		
		while (!validString) {
			try {
				System.out.println("Nhập chuỗi:  ");
				input = sc.nextLine();
				isValidString(input, "Vui lòng nhập lại ! ");
				validString = true;
				
			} catch (InvalidInputValidation e) {
				System.out.println("Error: " + e.getMessage());
			}
			findLongMaxString(input);
			findLongMinString(input);
		
		}
	}
	private static void findLongMaxString(String input) {
		int max = 0;
		String maxString = "";
		int position = 0;
		for(int i = 0; i<input.length();i++) {
			for(int k = i+1; k<=input.length();k++) {
				String subString = input.substring(i, k);
				if(subString.length()>1&&subString.charAt(0)==subString.charAt(subString.length()-1)) {
					if(subString.length()>max) {
						maxString = subString;
						max = maxString.length();
						position = i;
					}
				} else {
				continue;
				
				}
			
			}
		}
		System.out.println(" Độ dài lớn nhất của dãy con đúng là: "+max);
		System.out.println(" Bắt đầu từ vị trí: "+position+" trong sâu S");
	}
	private static void findLongMinString(String input) {
		int min = input.length();
		String minString = "";
		int position = 0;
		for(int i = 0; i<input.length();i++) {
			for(int k = i+1; k<=input.length();k++) {
				String subString = input.substring(i, k);
				if(subString.length()>1&&subString.charAt(0)==subString.charAt(subString.length()-1)) {
					if(subString.length()<min) {
						minString = subString;
						min = minString.length();
						position = i;
					}
				} else {
				continue;
				
				}
			
			}
		}
		System.out.println(" Độ dài nhỏ nhất của dãy con đúng là: "+min);
		System.out.println(" Bắt đầu từ vị trí: "+position+" trong sâu S");
	}
	private static void isValidString(String text, String message) throws InvalidInputValidation {
		String pattern = "^[a-z]+$";

		if (!text.matches(pattern)) {
			throw new InvalidInputValidation(message);
		}
	}
}



