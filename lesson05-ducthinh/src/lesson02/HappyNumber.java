package lesson02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		int num = inputIntNumber();
		if(isHappyNumber(num)) {
			System.out.println(num + " is a happy number.");
		}else {
			System.out.println(num + " isn't a happy number.");
		}
	}
	
	// Hàm nhập số nguyên dương lớn hơn 0
	public static int inputIntNumber() {
		int num;
		while(true) {
			try {
				System.out.println("Input positive non-zero number: ");
				num = Integer.parseInt(ip.nextLine());
				if(num > 0) {
					return num;
				}else {
					System.out.println("Number must be positive non-zero number, please try again!");
				}
			} catch (NumberFormatException e) {
				System.out.println("Number must be positive non-zero number, please try again!");
			}
		}
	}
	
	// Hàm kiểm tra một số có phải là happy number hay không
	public static boolean isHappyNumber(int num) {
		Set<Integer> existed = new HashSet<>();		
		while(num != 1 && !existed.contains(num)) {
			existed.add(num);
			int sum = 0;
			while(num > 0) {
				int digit = num % 10;
				sum += digit * digit;
				num /= 10;
			}
			num = sum;
		}
		return num == 1;
	}
}
