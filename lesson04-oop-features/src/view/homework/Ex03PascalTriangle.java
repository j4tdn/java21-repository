package view.homework;

import java.util.stream.Stream;

public class Ex03PascalTriangle {

	public static void main(String[] args) {

		Integer[] multipleOf7 = { 7, 14, 21 };
		Integer[] multupleOf5 = { 5, 10, 15 };
		
		int[] result = Stream.concat(Stream.of(multipleOf7), Stream.of(multupleOf5))
				.mapToInt(Integer::intValue)
				.toArray();
		
		for (Integer number: result) {
			System.out.println(number);
		}
		
		int n = 6;
		int[][] matrix = new int[n][n];

		for (int row = 1; row < matrix.length; row++) {
			for (int col = 0; col <= row; col++) {
				if (col == 0 || col == row) {
					matrix[row][col] = 1;
				} else {
					matrix[row][col] = matrix[row - 1][col - 1] + matrix[row - 1][col];
				}
			}
		}
		
		

		System.out.println("Pascal Triangle");
		for (int row = 1; row < matrix.length; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}

	}
}
