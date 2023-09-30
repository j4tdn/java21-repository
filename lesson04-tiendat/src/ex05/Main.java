package ex05;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Number> numbers = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số phần tử tối đa cho mảng: ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
			int value = scanner.nextInt();
			numbers.add(new Number(value));
		}

		// Sắp xếp
		Number.sortByLevel(numbers);

		// In ra kết quả
		System.out.println("\nMảng sau khi sắp xếp:");
		for (Number number : numbers) {
			System.out.print(number.getValue() + " ");
		}

	}

}
