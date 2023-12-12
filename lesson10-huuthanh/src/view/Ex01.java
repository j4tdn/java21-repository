package view;

import static Util.ArrayUtil.*;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {

		int[] arr = { 4, -1, 100, 7,-1,5,5};
		int[] arrr = removeDuplicatesInt(arr);

		for (int i = 0; i < arrr.length; i++) {
			System.out.print(arrr[i] + " ");
		}

		System.out.println();
		if(compareNumber(arr)) {
			System.out.println("Trước lớn hơn sau.");
		}
		else System.out.println("Sau lớn hơn trước.");
		
		sort(arrr, 3);
	}
	 
	 
}
