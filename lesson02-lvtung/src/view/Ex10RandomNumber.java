package view;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// Viết chương trình in ra 5 số nguyên ngẫu nhiên từ 20 đến 30 → [20, 30]

public class Ex10RandomNumber {
	public static void main(String[] args) {
		Set<Integer> randomNumber = new HashSet<Integer>();
		Random rd = new Random();
		
		while (randomNumber.size() < 5) {
			int number = rd.nextInt(20, 30);
			randomNumber.add(number);
		}
		
		System.out.println("5 số ngẫu nhiên không trùng nhau trong khoảng [20, 30]là: ");
		for (int number: randomNumber) {
			System.out.println(number);
		}
	}
}
