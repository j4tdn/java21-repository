package ex04_readnumber;

import java.util.Scanner;

public class Ex04ReadNumber {

	private Scanner scanner;

	public Ex04ReadNumber() {
		scanner = new Scanner(System.in);
	}

	public static void main(String[] args) {
		Ex04ReadNumber program = new Ex04ReadNumber();
		int n = program.input();

		System.out.println("n = " + n + " -> " + program.readNumber(n));
		program.closeScanner();
	}

	private int input() {
		int n;

		do {
			try {
				System.out.print("Enter an integer N with 3 digits -> ");
				n = Integer.parseInt(scanner.nextLine());
				if (n >= 0 && n < 1000)
					return n;
				else
					throw new NumberFormatException();
			} catch (NumberFormatException e) {
				System.out.println("Invalid input! Please try again.");
			}

		} while (true);
	}

	private String readNumber(int n) {
		String result = readHundredsDigit(n) + readTensAndOnesDigit(n);

		return result.trim();
	}

	private String readHundredsDigit(int n) {
		String[] hundreds = { "", "Một trăm", "Hai trăm", "Ba trăm", "Bốn trăm", "Năm trăm", "Sáu trăm", "Bảy trăm",
				"Tám trăm", "Chín trăm" };
		return hundreds[n / 100];
	}

	private String readTensAndOnesDigit(int n) {
		int tens = (n / 10) % 10;
		int ones = n % 10;

		if (tens == 1) {
			String[] teens = { "", "Mười", "Hai mươi", "Ba mươi", "Bốn mươi", "Năm mươi", "Sáu mươi", "Bảy mươi",
					"Tám mươi", "Chín mươi" };
			return teens[ones];
		} else {
			String[] tensText = { "", "Mười", "Hai mươi", "Ba mươi", "Bốn mươi", "Năm mươi", "Sáu mươi", "Bảy mươi",
					"Tám mươi", "Chín mươi" };
			String[] onesText = { "", "Một", "Hai", "Ba", "Bốn", "", "Sáu", "Bảy", "Tám", "Chín" };

			String result = tensText[tens];
			if (ones != 0)
				result += " " + onesText[ones];

			return result;
		}
	}

	private void closeScanner() {
		scanner.close();
	}

}
