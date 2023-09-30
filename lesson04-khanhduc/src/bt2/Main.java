package bt2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Nhập số lượng phần tử của dãy
		System.out.print("Nhập số lượng phần tử của dãy: ");
		int n = scanner.nextInt();

		// Khai báo một danh sách ArrayList để lưu trữ dãy số
		ArrayList<Integer> numbers = new ArrayList<>();

		// Nhập dãy số nguyên
		System.out.println("Nhập các số nguyên:");
		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			numbers.add(num);
		}

		// Sắp xếp dãy số
		ArrayList<Integer> divisibleBy7 = new ArrayList<>();
		ArrayList<Integer> divisibleBy5 = new ArrayList<>();
		ArrayList<Integer> others = new ArrayList<>();

		for (int num : numbers) {
			if (num % 7 == 0 && num % 5 == 0) {
				divisibleBy7.add(num);
			} else if (num % 7 == 0) {
				divisibleBy7.add(num);
			} else if (num % 5 == 0) {
				divisibleBy5.add(num);
			} else {
				others.add(num);
			}
		}

		// Gộp các dãy lại theo yêu cầu
		ArrayList<Integer> result = new ArrayList<>();
		result.addAll(divisibleBy7);
		result.addAll(others);
		result.addAll(divisibleBy5);

		// In ra kết quả
		System.out.print("Output: ");
		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i));
			if (i < result.size() - 1) {
				System.out.print(", ");
			}
		}
	}

}
