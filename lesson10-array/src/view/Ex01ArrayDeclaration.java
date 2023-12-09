package view;

import java.util.Arrays;

public class Ex01ArrayDeclaration {

	public static void main(String[] args) {
		
		// mảng chứa các phần tử là KDL nguyên thủy, KDL đối tượng
		
		// khai báo mảng 1 chiều
		int[] digits = new int[3];
		int[] numbers = new int[] {2, 5, 8};
		int[] elements = {2, 5, 8, 7, 9};
		
		// --> digits là KDL đối tượng
		// --> digits thuộc class là [I (digits.getClass())
		
		String[] words = {"hello", "xin chao", "welcome"};
		System.out.println("words class: " + words.getClass().getSimpleName());
		
		modify(words);
		
		System.out.println("words: " + Arrays.toString(words));
		
		// khai báo mảng 2 hay nhiều(n) chiều
		
		// mảng 1 chiều: mỗi phần tử là 1 giá trị đơn(nguyên thủy, đối tượng)
		
		// mảng 2 chiều: mỗi phần tử là 1 mảng 1 chiều
		
		// mảng 3 chiều: mỗi phần tử là 1 mảng 2 chiều
		int[][][] a = new int[5][5][5];
		int[][][] b = {
				{{1,2}, {3}},
				{{5,7}, {9}},
		};
		
		// mảng n chiều: mỗi phần tử là 1 mảng n-1 chiều
		
		// cần lưu trữ mảng từ 3 chiều trở lên --> chuyển sang dùng mảng đối tượng 1 chiều
		int[][][] c = {
				{{1,2}, {3}},
				{{5,7}, {9}},
		};
		// Type[] types = {new Type(1,2,3), new Type(5,7,9)};
		// Type: x, y, z
		// b[0][1][0] --> types[0].getZ()
		
	}
	
	private static void modify(String[] elements) {
		elements[1] = null;
	}
	
	private static int[] getNumbers() {
		return new int[] {2, 5, 8};
	}
	
	private static int[] getElements() {
		return new int[] {2, 5, 8, 7, 9};
	}
	
}
