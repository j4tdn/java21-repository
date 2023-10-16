package exercise01;

import java.util.Scanner;

public class getMinFract {
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		int wrongTimes = 0;
		String input = "";

		// kiểm tra input và in ra màn hình số lần sai/ hợp lệ
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "): " : ": ";
			System.out.print("Nhập số hợp lệ: " + suffix);

			input = ip.nextLine();
			if (isNumber(input)) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 3) {
				System.out.println("Bạn đã nhập sai quá 3 lần.");
				break;
			}

		} while (true);
	}

	// kiểm tra input có phải số hay k
	private static boolean isNumber(String input) {
		if (input == "") {
			return false;
		}
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) < '0' || input.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}


}