package ex04_convertNumberToWords;

public class Ex04_convertNumberToWords {
	private static String[] units = { "", "Mươi", "Trăm" };

	private static String[] digits = { "", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín" };

	public static String readNumber(int n) {
		if (n < 1 || n > 999) {
			return "Số n không hợp lệ";
		}

		if (n == 0) {
			return "Không";
		}

		String result = "";

		int digit1 = n % 10; // Đơn vị
		int digit10 = (n / 10) % 10; // Chục
		int digit100 = n / 100; // Trăm

		if (digit100 > 0) {
			result += digits[digit100] + " " + units[2] + " ";
		}

		if (digit10 > 0) {
			if (digit10 == 1) {
				result += units[1] + " ";
			} else {
				result += digits[digit10] + " " + units[0] + " ";
			}
		}

		if (digit1 > 0) {
			if (digit10 == 1) {
				result += "linh " + digits[digit1] + " ";
			} else {
				result += digits[digit1] + " ";
			}
		}

		return result.trim();
	}

	public static void main(String[] args) {
		int[] numbers = { 6, 5, 25, 101, 321, 820, 219 };
		for (int number : numbers) {
			System.out.println(number + " => " + readNumber(number));
		}
	}
}
