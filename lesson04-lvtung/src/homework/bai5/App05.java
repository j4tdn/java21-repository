package homework.bai5;

import java.util.Random;
import java.util.Scanner;

public class App05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random rd = new Random();

		System.out.print("Nhập số lượng phần tử (3 <= n <= 20): ");
		int n = Integer.parseInt(scanner.nextLine());
		scanner.close();

		if (n < 3 || n > 20) {
			System.out.println("Số lượng phần tử không hợp lệ. Phải nằm trong khoảng từ 3 đến 20.");
			return;
		}

		int[] arrNum = new int[n];
		int[] levels = new int[n];

		System.out.print("Mảng số nguyên: ");
		for (int i = 0; i < n; i++) {
			int rdNumber = rd.nextInt(3, 21);
			arrNum[i] = rdNumber;
			levels[i] = countFactors(arrNum[i]);
			System.out.print(arrNum[i] + " ");
		}

		// Sắp xếp mảng theo level tăng dần
		sortArrayByLevel(arrNum, levels);

		System.out.print("\nMảng số nguyên sau khi sắp xếp: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arrNum[i] + " ");
		}
	}

	public static int countFactors(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return count;
	}

	public static void sortArrayByLevel(int[] arr, int[] levels) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (levels[i] > levels[j]) {
					// Hoán đổi giá trị level
					int tempLevel = levels[i];
					levels[i] = levels[j];
					levels[j] = tempLevel;

					// Hoán đổi giá trị phần tử
					int tempElement = arr[i];
					arr[i] = arr[j];
					arr[j] = tempElement;
				}
			}
		}
	}

}
