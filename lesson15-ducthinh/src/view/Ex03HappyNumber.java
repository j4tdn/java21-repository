package view;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex03HappyNumber {
	static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		Integer num = inputNumber();
		if(isHappyNumber(num)) {
			System.out.println(num + " is Happy Number");
		}else {
			System.out.println(num + " is not Happy Number");
		}
	}
	
	public static boolean isHappyNumber(Integer num) {
		Set<Integer> repo = new HashSet<>();
		while(num != 1 && !repo.contains(num)) {
			repo.add(num);
			num = getSumofNumber(num);
		}
		return num == 1;
	}
	
	public static int getSumofNumber(Integer num) {
		int sum = 0;
		while(num > 0) {
			int digit = num % 10;
			sum += Math.pow(digit, 2);
			num /= 10;
		}
		return sum;
		
	}
	
	public static Integer inputNumber() {
		int num = 0;
		boolean check = false;
		while(!check) {
			System.out.print("input number ==> ");
			try {
				num = Integer.parseInt(ip.nextLine());
				if(num > 0) {
					return num;
				}else {
					System.out.println("Please input positive number");
				}
			} catch (NumberFormatException e) {
				System.out.println(e);
			}

		}
		return num;
	}
}
