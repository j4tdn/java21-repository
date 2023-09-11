package view;

import java.util.Scanner;

public class Ex05Symmetric {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Nhập n = ");
		String number = ip.nextLine();

		while ((!isNumeric(number) || number.length() < 2)) {
			System.out.print("Nhập lại n = ");
			number = ip.nextLine();
		}
		
		checkSymmetric(number);

		ip.close();
	}
	
	public static void checkSymmetric(String number) {
		  StringBuilder sb = new StringBuilder(number);
		  // đảo chuỗi
		  if(number.equals(sb.reverse().toString())) {
			  System.out.println(number + " là số đối xứng");
		  } else {
			  System.out.println(number + " không phải là số đối xứng");
		  }
		}

	private static boolean isNumeric(String number) {

		if ("".equals(number)) {
			return false;
		}
		final int size = number.length();
		for (int i = 0; i < size; i++) {
			if (!Character.isDigit(number.charAt(i))) {
				return false;
			}
		}

		return true;
	}
}
