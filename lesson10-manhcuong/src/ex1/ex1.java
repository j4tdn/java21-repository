package ex1;

import java.util.Arrays;

public class ex1 {
	public static void main(String[] args) {
		int[] arr = new int[] { 7, 8, 8, 8, 6, 2, 5, 1 };
//		removeDuplicatedNumbers(arr);
//		System.out.println(compare2Halfs(arr));
		System.out.println(max3rd(arr));
	}

	private static int max3rd(int[] input) {
		int[] temp = Arrays.copyOf(input, input.length);
		Arrays.sort(temp);
		int rank = 1;
		int max3 = temp[temp.length - 1];
		for (int i = temp.length - 1; i >= 0; i--) {
			if (rank == 3) break;
			if (max3 > temp[i]) {
				max3 = temp[i];
				rank++;
			}
		}
		return max3;
	}

}
