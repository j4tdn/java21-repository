package datastructure;

import java.util.Scanner;

public class Ex02ExponentOf2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int wrongTimes = 0;
		String input = "";
		
		// kiểm tra input và in ra màn hình số lần sai/ hợp lệ
		do { 
			String suffix = wrongTimes > 0? "(" + wrongTimes + "): " : ": ";
			System.out.print("Nhập số hợp lệ: " + suffix);
			
			input = ip.nextLine();
			if (isNumber(input)) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 5) {
				System.out.println("Bạn đã nhập sai quá 5 lần: ");
			}
			
		} while (true);
		
		int n = Integer.parseInt(input);
		if (isExponentOfTwo(n)) {
			System.out.println(n + " là bội của 2");
		} else {
			System.out.println(n + " không phải là bội của 2");
		}
	}
		
		
		private static boolean isExponentOfTwo(int n) {
			if (n == 1) {
				return true;
			}
			int run = 2;
			while (run != n) {
				run = run * 2;
				if (run > n) {
					return false;
				}
			}
			return true;
	}
	
	
	// kiểm tra chuỗi nhập vào có phải số hay k
	private static boolean isNumber (String input) {
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
