package ex02;

import java.util.ArrayList;
import java.util.Random;

class Number {
	int value;

	public Number(int value) {
		this.value = value;
	}

	public boolean isDivisibleBy7() {
		return (this.value % 7 == 0);
	}

	public boolean isDivisibleBy5() {
		return (this.value % 5 == 0);
	}
}

class NumberList {

	private ArrayList<Number> numbers;

	public NumberList() {
		this.numbers = new ArrayList<>();
	}

	public void generateRandom(int size) {
		Random rand = new Random();
		for (int i = 0; i < size; i++) {
			numbers.add(new Number(rand.nextInt(100)));
		}
	}

	public void print() {
		for (Number n : numbers) {
			System.out.print(n.value + " ");
		}
		System.out.println();
	}

	// Sắp xếp các số vào mảng
	public void rearrange() {
		ArrayList<Number> result = new ArrayList<>();

		// Số chia hết cho 7
		for (Number n : numbers) {
			if (n.isDivisibleBy7()) {
				result.add(n);
			}
		}

		// Số chia hết cho 5
		for (Number n : numbers) {
			if (n.isDivisibleBy5()) {
				result.add(n);
			}
		}

		// Các số còn lại
		for (Number n : numbers) {
			if (!n.isDivisibleBy7() && !n.isDivisibleBy5()) {
				result.add(result.size() / 2, n);
			}
		}

		this.numbers = result;
		
		print();
	}

}