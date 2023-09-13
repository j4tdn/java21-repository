package view;

import java.util.Scanner;import javax.swing.plaf.basic.BasicPasswordFieldUI;

import utils.IoUtils;

public class Ex01Multiple {
	
	public static void main(String[] args) {
		// Nhập N là số nguyên dương được nhập từ bàn phím
		// Bắt buộc nhập lại nếu N không hợp lệ (tối đa 5 lần)
		
		// regex: regular expression --> biểu thức chính quy
		//      : tập hợp các cú pháp, công thức để kiểm tra chuỗi có thỏa mãn cú pháp hay không
		
		// [0-9] --> \d
		// {1,}  --> +
		// {0,}  --> *
		
		int number = IoUtils.enterNumber();
		
		System.out.println("isEven --> " + (number % 2 == 0));
	}
	
	// 12191ab281
	// -15
	// 22
	// 0
	private static boolean isPositiveNumber(String text) {
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return Integer.parseInt(text) > 0;
	}
	
}
