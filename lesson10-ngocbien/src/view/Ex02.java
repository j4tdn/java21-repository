package view;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,8,7},{1,9,0,9},{2,9,6,5},{1,2,4,5}};
		System.out.println("Origin: ");
		printMatrix(matrix);
		System.out.println("After convert: ");
		convert(matrix);
		printMatrix(matrix);
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++){ 
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	public static void convert(int[][] matrix) {
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++){ 
				if(matrix[row][col] == 0) {
					for(int i = 0; i < matrix.length; i++) {
						matrix[i][col] = 0;
					}
					for(int j = 0; j < matrix[row].length; j++) {
						matrix[row][j] = 0;
					}
					return;
				}
			}
		}
	}
	
	
}
