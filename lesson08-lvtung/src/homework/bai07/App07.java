package homework.bai07;

import static utils.FormatUtils.*;

import java.util.Scanner;

public class App07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = null;
		do {
			System.out.print("Enter a string: ");
			S = scanner.nextLine().strip().replaceAll("\\s+", " ");
		} while (!isValidName(S));

		int maxLength = findMaxLength(S);
		int minLength = findMinLength(S);

		System.out.println("Độ dài lớn nhất của dãy con đúng: " + maxLength);
		System.out.println("Độ dài nhỏ nhất của dãy con đúng: " + minLength);
		
		scanner.close();
	}

	public static int findMaxLength(String S) {
		int maxLength = 0;
		int currentLength = 1;

		for (int i = 1; i < S.length(); i++) {
			if (S.charAt(i) == S.charAt(i - 1)) {
				currentLength++;
			} else {
				maxLength = Math.max(maxLength, currentLength);
				currentLength = 1;
			}
		}

		maxLength = Math.max(maxLength, currentLength);

		return maxLength;
	}

	public static int findMinLength(String S) {
		int minLength = Integer.MAX_VALUE;
		int currentLength = 1;

		for (int i = 1; i < S.length(); i++) {
			if (S.charAt(i) == S.charAt(i - 1)) {
				currentLength++;
			} else {
				minLength = Math.min(minLength, currentLength);
				currentLength = 1;
			}
		}

		minLength = Math.min(minLength, currentLength);

		return minLength;
	}
}
