package ex04ReadNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test04 {

	private static final Map<Integer, String> NUMBER_MAP = new HashMap<>();

	static {
		NUMBER_MAP.put(0, "Không");
		NUMBER_MAP.put(1, "Một");
		NUMBER_MAP.put(2, "Hai");
		NUMBER_MAP.put(3, "Ba");
		NUMBER_MAP.put(4, "Bốn");
		NUMBER_MAP.put(5, "Năm");
		NUMBER_MAP.put(6, "Sáu");
		NUMBER_MAP.put(7, "Bảy");
		NUMBER_MAP.put(8, "Tám");
		NUMBER_MAP.put(9, "Chín");
		NUMBER_MAP.put(10, "Mười");
	}

	public static String readNumber(int number) throws IllegalArgumentException {
		if (number < 0 || number > 999) {
			throw new IllegalArgumentException("Invalid Number");
		}

		if (number == 0) {
			return NUMBER_MAP.get(0);
		} else if (number == 10) {
			return NUMBER_MAP.get(10);
		}

		StringBuilder result = new StringBuilder();

		int hundreds = number / 100;
		if (hundreds > 0) {
			result.append(NUMBER_MAP.get(hundreds)).append(" Trăm ");
		}

		int tens = number % 100;
		int onesDigit = tens % 10;
		if (tens >= 10 && tens <= 19) {
			result.append(" Mười ").append(NUMBER_MAP.get(tens % 10));
		} else {
			int tensDigit = tens / 10;
			if (tensDigit != 0) {
				result.append(NUMBER_MAP.get(tensDigit));
				if (onesDigit > 0) {
					result.append(" Mươi ");
				}
			} else if (onesDigit > 0) {
				result.append(" Linh ");
			}

			if (onesDigit > 0) {
				result.append(NUMBER_MAP.get(onesDigit));
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number (0-999): ");
		int number = sc.nextInt();

		try {
			String result = readNumber(number);
			System.out.println("Result: " + result);
			sc.close();
		} catch (IllegalArgumentException e) {
			System.out.println("Message: " + e.getMessage());
		}
	}
}