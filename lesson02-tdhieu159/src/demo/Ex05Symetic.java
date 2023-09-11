package datastructure;

import java.util.Scanner;

public class Ex05Symetic {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		String input = "";
		do {
			System.out.print("Nhập số ít nhất có 2 chữ số: ");

			input = ip.nextLine();
			if (isNumber(input)) {
				break;
			}
		} while (true);

		int number = Integer.parseInt(input);
		String result = isSymmetric(number) ? " là số đối xứng" : " không phải là số đối xứng";
		System.out.println(number + result);

	}

	
	private static boolean isNumber(String text) {
		if (text.length() <= 1) {
			return false;
		}
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}

	
	// kiểm tra khi đảo n có trùng với n k
	private static int reverse(int n) {
		int result = 0;
		while (n != 0) {
			int div = n % 10;
			result = result * 10 + div;
			n /= 10;
		}
		return result;
	}

	public static boolean isSymmetric(int n) {
		return n == reverse(n);
	}
}
