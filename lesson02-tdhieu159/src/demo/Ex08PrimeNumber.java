package datastructure;

import java.util.Scanner;

public class Ex08PrimeNumber {
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
		
		boolean isExponent = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0 ) {
				isExponent = false;
				break;
			} 
		}
		
		// in ra màn hình
		if (isExponent) {
			System.out.println(n + " là số nguyên tố");
		} else {
			System.out.println(n + " không phải là số nguyên tố");
		}
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

