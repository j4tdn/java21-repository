package view;

import java.util.Arrays;

public class Ex01ArrayDeclaration {
	
	
	public static void main(String[] args) {
		// mảng chứa các phần tử là KDL nguyên thủy, KDL đối tg

		// khai báo mảng 1 chiều
		int[] digits = new int[3];
		int[] numbers = new int[]{2, 5, 8};
		int[] elements = {2, 5, 8, 7, 9};
		
		// --> digits là KDL đối tg
		// --> digits thuộc class là [l ()digits.getClass()]
		
		System.out.println("digits class -->" + digits.getClass());
		System.out.println("numbers class -->" + numbers.getClass());
		System.out.println("elements class -->" + elements.getClass());

		String[] words = {"hello", "xin chào", "welcome"};
		System.out.println("words class -->" + words.getClass());

		modify(words);
		
		System.out.println("words: " + Arrays.toString(words));
		
		// khai báo mảng 2, n chiều(rất hạn chế)
		
		//	1, 2, 3, 4
		//  2, 6, 2, 3
		//  4, 7, 7, 1
		
		int[][] empty = new int[3][4];
		int[][] matrix = {
				{1, 2, 3, 4},
				{2, 6, 2, 3},
				{4, 7, 7, 1}
		};
		
		System.out.println("matrix[1] -->" + Arrays.toString(matrix));
		
		
		// matrix.length: số phần tử của mảng --> số dòng
		// matrix[rowI].length: số phần tử của dòng thứ i
		
		for (int rowI = 0; rowI <empty.length; rowI++) {
			for (int colI = 0; colI<empty[rowI].length; colI++) {
				System.out.println(empty[rowI][colI] + " ");
			}
			System.out.println();
		}
		
		
		for (int rowI = 0; rowI <matrix.length; rowI++) {
			for (int colI = 0; colI<matrix[rowI].length; colI++) {
				System.out.println(matrix[rowI][colI] + " ");
			}
			System.out.println();
		}
	}
	private static void modify(String[] elements) {
		elements[1] = null;
	}
	
	private static int[] getNumbers() {
		return new int[]{2, 5, 8};
	}
	
	private static int[] getElements() {
	//	return {2, 5, 8, 7, 9};
		return new int[] {2, 5, 8, 7, 9};
	}
	
}
