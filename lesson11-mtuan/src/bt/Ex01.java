package bt;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.print("Nhập n:");
		n = Integer.parseInt(sc.nextLine());
		int markNumber = 2 * n - 2;

		for (int row = 0; row <= markNumber; row++) {
			for (int column = 0; column <= markNumber; column++) {
				if (isNumber(row, column, markNumber)) {
					System.out.print((column + 1) + " ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}

	private static boolean isNumber(int row, int column, int markNumber) {
		int leftMarkNumber = row * 2;
		int rightMarkNumber = markNumber;

		if (leftMarkNumber > rightMarkNumber) {
		
			int tmp = leftMarkNumber;
			leftMarkNumber = rightMarkNumber;
			rightMarkNumber = tmp;
		}

		if ((row + column) > leftMarkNumber && (row + column) < rightMarkNumber) {
			return false;
		}

		return true;
	}
}