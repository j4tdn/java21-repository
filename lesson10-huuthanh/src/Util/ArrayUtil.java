package Util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import view.Item;

public class ArrayUtil {

	private ArrayUtil() {

	}
	
	// xóa các kí tự trùng lặp String
	public static String[] removeDuplicatesString(String[] array) {
		Set<String> set = new HashSet<>(Arrays.asList(array));

		String[] uniqueArray = set.toArray(new String[0]);

		return uniqueArray;
	}
	
	
	//xóa các kí tự trùng nhau Int
	public static int[] removeDuplicatesInt(int[] arr) {
	    Set<Integer> set = new HashSet<>();
	    for (int num : arr) {
	        set.add(num);
	    }

	    int[] uniqueArray = new int[set.size()];
	    int index = 0;
	    for (int num : set) {
	        uniqueArray[index++] = num;
	    }

	    return uniqueArray;
	}
	
	// so sánh n/2 phần tử đầu tiên và n/2 phần tử cuối cùng
	public static boolean compareNumber(int[] arr){
		int tmp =0;
		for(int i=0;i<arr.length/2+1;i++) {
			tmp+= arr[i] -arr[arr.length-i-1];
		}
		if(tmp>0)
		return true;
		return false;	
	}
	
	// sort và lấy ra phần tử lớn thứ n
	public static void sort(int[] arr, int n) {
		 Arrays.sort(arr);
		 System.out.println("Phần tử lớn thứ "+ n +" trong mảng "+arr[arr.length-n]);
	}
	// chuyển hàng và cột cs giá trị ) thành 0 trong mảng 2 chiều
	public static int[][] matrix(int[][] arr) {
	    int row = arr.length;
	    int col= arr[0].length;

	    boolean[] zeroRow = new boolean[row];
	    boolean[] zeroCol = new boolean[col];

	    // Xác định các hàng và cột chứa giá trị 0
	    for (int i = 0; i < row; i++) {
	        for (int j = 0; j < col; j++) {
	            if (arr[i][j] == 0) {
	                zeroRow[i] = true;
	                zeroCol[j] = true;
	            }
	        }
	    }

	    // Chuyển đổi các hàng và cột có chứa giá trị 0 thành 0
	    for (int i = 0; i < row; i++) {
	        for (int j = 0; j < col; j++) {
	            if (zeroRow[i] || zeroCol[j]) {
	                arr[i][j] = 0;
	            }
	        }
	    }

	    return arr;
	}
	
	public static void maxStore(Item item) {
		
	}
}


