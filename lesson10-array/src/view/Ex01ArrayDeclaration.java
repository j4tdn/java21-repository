package view;

import java.util.Arrays;

public class Ex01ArrayDeclaration {

	public static void main(String[] args) {
		// mảng chứa các phần tử là KDL nguyên thủy, KDL đối tượng

		// khai báo mảng 1 chiều
		int[] digits = new int[3];
		int[] numbers = new int[]{ 2, 5, 8 };
		int[] elements = { 2, 5, 8, 7, 9};

		// --> digits là KDL đối tượng
		// --> digits thuộc class là [I (digits.getClass())
		
		System.out.println("digits class --> " + digits.getClass());
		System.out.println("numbers class --> " + numbers.getClass());
		System.out.println("elements class --> " + elements.getClass());
		
		String[] words = {"hello", "xin chao", "welcome"}; // H1
		System.out.println("words class: " + words.getClass().getSimpleName());

		modify(words);
		
		System.out.println("words: " + Arrays.toString(words));
		
		// khai báo mảng 2(thường sử dụng), n chiều(hạn chế sử dụng)
		
		// mảng 1 chiều: mỗi phần tử là 1 giá trị đơn(nguyên thủy, đối tượng)
		
		System.out.println("\n=========== Mảng nhiều chiều ==============");
		// mảng 2 chiều: mỗi phần tử là 1 mảng 1 chiều
		// ví dụ: ma trận(rows, columns) --> 3rows*4colums
		// 1 2 3 4
		// 2 6 2 3
		// 4 7 7 1
		int[][] empty = new int[3][4];
		int[][] matrix = {
				{1, 2, 3, 4},
				{2, 6, 2 ,3},
				{4, 7, 7, 1}
		};
		
		System.out.println("matrix[1] --> " + Arrays.toString(matrix[1]));
		
		// matrix.length: số phần tử của mảng --> số dòng
		// matrix[rowI].length: số phần tử của dòng thứ i
		
		for (int rowI = 0; rowI < empty.length; rowI++) {
			for (int colI = 0 ; colI < empty[rowI].length; colI++) {
				System.out.print(empty[rowI][colI] + " ");
			}
			System.out.println();
		}
		
		for (int rowI = 0; rowI < matrix.length; rowI++) {
			for (int colI = 0 ; colI < matrix[rowI].length; colI++) {
				System.out.print(matrix[rowI][colI] + " ");
			}
			System.out.println();
		}
		
		// mảng 3 chiều: mỗi phần từ là 1 mảng 2 chiều
		int[][][] a = new int[5][5][5];
		int[][][] b = {
				{{1,2}, {3}},
				{{5,7}, {9}},
		};
		System.out.println("b[0] --> " + b[0][1][0]);
		
		// mảng n chiều: mỗi phần từ là 1 mảng n-1 chiều
		
		// cần lưu trữ mảng từ 3 chiều trở lên --> chuyển sang dùng mảng đối tượng một chiều
		int[][][] c = {
				{{1,2}, {3}},
				{{5,7}, {9}},
		};
		// Type[] types = {new Type(1,2,3), new Type(5,7,9)};
		// Type: x, y, z
		// b[0][1][0] --> types[0].getZ()
		
		// Ox * Oy * Oz --> On --> reduce complexity
	}
	
	// String[] elements = words --> H1
	private static void modify(String[] elements) {
		elements[1] = null;
	}
	
	private static int[] getNumbers() {
		return new int[]{ 2, 5, 8 };
	}
	
	private static int[] getElements() {
		// return { 2, 5, 8, 7, 9};
		return new int[]{ 2, 5, 8, 7, 9};
	}

}