package ex03;

import java.util.Arrays;
import java.util.Scanner;

import view.InvalidInputValidation;

public class App {
	static String resultString1 = "";
	static String resultString = "";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		StringBuilder stringBuil = new StringBuilder();
				char[] charVie = {'á','à','ạ','ả','ã',
								'ă','ắ','ằ','ặ','ẳ','ẵ',
								'â','ấ','ầ','ậ','ẩ','ẫ',
								'ó','ò','ọ','ỏ','õ',
								'ô','ố','ồ','ộ','ổ','ỗ',
								'ơ','ớ','ờ','ợ','ở','ỡ',
								'ú','ù','ụ','ủ','ũ',
								'ư','ứ','ừ','ự','ử','ữ',
								'é','è','ẹ','ẻ','ẽ',
								'ê','ế','ề','ệ','ể','ễ',
								'i','í','ì','ị','ỉ','ĩ',
									'đ'	};
				char[] charEng = {'a','a','a','a','a',
								'a','a','a','a','a','a',
								'a','a','a','a','a','a',
								'o','o','o','o','o',
								'o','o','o','o','o','o',
								'o','o','o','o','o','o',
								'u','u','u','u','u',
								'u','u','u','u','u','u',
								'e','e','e','e','e',
								'e','e','e','e','e','e',
								'i','i','i','i','i','i',
								'd'	};
		boolean validString = false;
		while (!validString) {
			try {
				System.out.println("Nhập chuỗi tiếng Việt:  ");
				input = sc.nextLine();
				isValidString(input, "Vui lòng nhập lại !");
				validString = true;
			} catch (InvalidInputValidation e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		splitAndUpcase(input,charVie,charEng);
	}
	private static void isValidString(String text, String message) throws InvalidInputValidation {
		String pattern = "^[\\p{L}\\s\\p{M}]+$";

		if (!text.matches(pattern)) {
			throw new InvalidInputValidation(message);
		}
	}
	public static void splitAndUpcase(String input, char[] charVie, char[] charEng) {
		char[] inputs = input.toCharArray();
		for(int i = 0; i < inputs.length; i++) {
			for(int k =0; k<charVie.length; k++) {
				if(inputs[i]==charVie[k]) {
					resultString = input.replace(inputs[i],charEng[k] );
					input = resultString;
					
				}
			}
		
		}
		System.out.println(resultString);
	}
}

