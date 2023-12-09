package view;

import java.util.Arrays;

public class Ex01ArrraDeclaration {

	public static void main(String[] args) {
		// mảng chứa các phần tử là KDL nguyên thủy, KDL đối tượng
		
		// Khai báo mảng 1 chiều
		int[] digits = new int[3];
		int[] numbers = new int[] {2, 5, 8};
		int[] elements = {2, 5, 8, 7, 9};
		
		// --> digits là KDL đối tượng
		// --> digits thuốc class là [I (digits.getClass())
		
		System.out.println("digits class --> " + digits.getClass());
		System.out.println("numbers class --> " + numbers.getClass());
		System.out.println("elements class --> " + elements.getClass());
		
		String[] words = {"hello", "xin chao", "welcome"};
		System.out.println("words class: " + words.getClass().getSimpleName());
		
		modify(words);
		
		System.out.println("words: " + Arrays.toString(words));
		
		// Khai báo mảng 2(thường sử dụng), n chiều(hạn chế sử dụng)
		
		// mảng 1 chiều: mỗi phần tử là 1 giá trị đơn(nguyên thủy, đối tượng)
		
		System.out.println("\n===============Mảng nhiều chiều=================");
		// mảng 2 chiều: mỗi phần tử là mảng 1 chiều
		// ví dụ: ma trận(rows, columns) --> 3rows*4columns
		// 1 2 3 4
		// 2 6 2 3
		// 4 7 7 1
		int[][] empty = new int[3][4];
		int[][] matrix = {
				{1,2,3,4},
				{2,6,2,4},
				{4,7,7,1}
		};
		System.out.println("maxtrix[1]: " + Arrays.toString(matrix[1]));
		
		// matrix.leng: số phần tử của mảng --> số dòng
		// matrix[rowI].leng: số phần tử của dòng thứ i
		
		for(int rowI = 0; rowI < matrix.length; rowI++) {
			for(int colI = 0; colI < matrix[rowI].length; colI++) {
				System.out.print(matrix[rowI][colI] + " ");
			}
			System.out.println();
		}
		
		// mảng 3 chiều: mối phần tử là 1 mảng 2 chiều
		
		// mảng n chiều: mỗi phần từ là 1 mảng n-1 chiều
		
		// nếu cần lưu trữ từ 3 chiều trở lên --> chuyển sang mảng đối tượng
		
		
	}
	
	private static void modify(String[] elements) {
		elements[1] = null;
	}
	
	private static int[] getNumbers() {
		int[] numbers = new int[] {2, 5, 8};
		return new int[] {2, 5, 8};
	}
	
	private static int[] getElements() {
		int[] elements = {2, 5, 8, 7, 9};
		// return {2, 5, 8, 7, 9};
		return elements;
	}
	
}
