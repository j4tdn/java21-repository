package exam.bai04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = null;

		do {
			System.out.print("Nhập một chuỗi ký tự không dấu: ");
			input = scanner.nextLine().strip().replaceAll("\\s+", " ");
		} while (!isValidName(input));

		System.out.println("Các hoán vị của chuỗi " + input + " là:");
		generatePermutations(input, 0, input.length() - 1);

		scanner.close();
	}

	private static void generatePermutations(String str, int left, int right) {
		if (left == right) {
			System.out.println(str);
		} else {
			for (int i = left; i <= right; i++) {
				str = swap(str, left, i);
				generatePermutations(str, left + 1, right);
				str = swap(str, left, i); // Trả lại chuỗi về trạng thái ban đầu
			}
		}
	}

	private static String swap(String str, int i, int j) {
		char[] charArray = str.toCharArray();
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return new String(charArray);
	}

	private static boolean isValidName(String name) {
		// Kiểm tra xem họ tên chỉ chứa các ký tự [A-Za-z ]
		if (!Pattern.matches("^[A-Za-z ]+$", name)) {
			System.err.println("Chuỗi ký tự chỉ được chứa các ký tự [A-Za-z ]!");
			return false;
		}

		// Kiểm tra xem có ký tự có dấu hoặc ký tự số trong họ tên không
		Pattern pattern = Pattern.compile("[\\p{InCombiningDiacriticalMarks}\\p{Digit}]");
		Matcher matcher = pattern.matcher(name);

		if (matcher.find()) {
			System.err.println("Chuỗi ký tự không được chứa ký tự dấu hoặc ký tự số. Vui lòng nhập lại.");
		}
		return true;
	}
}
