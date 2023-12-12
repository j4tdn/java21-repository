package view;

import java.util.Arrays;

public class Ex01ArrayDeclaration {
	public static void main(String[] args) {
		// khai báo mảng 1 chiều
		
		// khai báo mảng 2, n chiều
		int[] digits = new int[3];
		int[] numbers = {2, 5, 8};
		// --> digits là KDl đối tượng
		// --> digits thuộc class là [I (digits.getClass())
		
		System.out.println("digits class --> " + digits.getClass());
		System.out.println("numbers class --> " + numbers.getClass());

		
		String[] words = {"hello", "xinchao", "welcome"};
		System.out.println("words class --> " + words.getClass());
		modify(words);
		System.out.println("words --> " + Arrays.toString(words));
		// mảng chứa các phần tử là KDL nguyên thủy, KDL đối tượng
		
		// Khai báo mảng 2( thường sử dụng ), n chiều (hạn chế sử dụng)
		// mảng 1 chiều: mỗi phần tử là 1 giá trị đơn(nguyên thủy, đối tượng)
		// mảng 2 chiều: mỗi phẩn tử là 1 mảng 1 chiều
		// ví dụ: ma trận(rows, columns) --> 3row*4columns
		// 1 2 3 4
		// 2 6 2 3
		// 4 7 7 1
		
		int[][] empty = new int[3][4];
		int[][] matrix = {
				{1, 2, 3, 4},
				{2, 6, 2, 3},
				{4, 7, 7, 1}
		};
		System.out.println("\n============= Mảng nhiều chiều================\n");
		System.out.println("matrix[0] --> " + Arrays.toString(matrix[1]));
		
		// matrix.length: Số phần tử của mảng --> số dòng
		// matrix[rowI].length: số phần tử của dòng thứ i
		for(int rowI = 0; rowI < matrix.length; rowI++) {
			for(int colI = 0; colI < matrix[rowI].length; colI++) {
				System.out.println(matrix[rowI][colI] + " ");
			}
			System.out.println();
		}
		// mảng 3 chiều: mỗi phần tử là 1 mảng 2 chiều
		// mảng n chiều: mỗi phần tử là 1 mảng n-1 chiều
		
		// cần lưu trữ mảng từ 3 chiều trở lên -- > chuyển sang dùng mảng đối tượng một chiều
		// Type[0] types = {new type(1,2,3), new Type(5,7,9)};
		// Type: x, y, z
		// b[0][1][0] --> types[0].getZ()
		
		// 0x * 0y * 0z --> 0n --> reduce complexity
	}
	
	private static void modify(String[] elements) {
		elements[1] = null;
	}
	
	
	private static int[] getNumbers() {
		return new int[] {2, 5, 8};
	}
}
