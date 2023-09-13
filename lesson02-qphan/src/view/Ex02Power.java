package view;

import utils.IoUtils;

public class Ex02Power {
	
	public static void main(String[] args) {
		
		int number = IoUtils.enterNumber();
		
		// Kiểm tra number có phải là lũy thừa của 2 không
		
		// 2^n = number
		
		// n = log(number)/log(2)
		
		double n = Math.log(number) / Math.log(2);
		
		// 12.23
		// 22.0201
		// 27.89
		// 19.00
		
		// n%1 == 0
		
		// int m = (int)n
		// (double)m == n
		
		// nếu n là số nguyên --> number là là lũy thừa của 2
		//          ngược lại --> number không phải là lũy thừa của 2
		
		// n: số nguyên
		
	}
}
