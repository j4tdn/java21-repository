package day08;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// kiểu nguyên thuỷ
		int[] mang1 = {1,2,3};
		
		// copy mang toan tu gan
		int[] mang1_a = mang1;
		mang1_a[0] = 100;
		
		System.out.println("mang1: " + Arrays.toString(mang1));
		System.out.println("mang1: " + Arrays.toString(mang1_a));
		
		// copy mang dung ham clone()
		int[] mang1_b = mang1.clone();
		mang1_b[0] = 200;
		
		System.out.println("mang1: " + Arrays.toString(mang1));
		System.out.println("mang1: " + Arrays.toString(mang1_b));
		
		// copy mang dung ham system.arraycopy
		int[] mang1_c = new int[mang1.length];
		System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
		mang1_c[0] = 300;
		
		System.out.println("mang1: " + Arrays.toString(mang1));
		System.out.println("mang1: " + Arrays.toString(mang1_c));
		
		// kieu doi tuong
		String[] mang_doi_tuong = {"TITV", ".vn"};
		String[] arr1 = mang_doi_tuong;
		arr1[0] = "hello";
		
		System.out.println("array: " + Arrays.toString(mang_doi_tuong));
		System.out.println("mang1: " + Arrays.toString(arr1));
		
		String[] arr2 = mang_doi_tuong.clone();
		arr2[0] = "bye";
		
		System.out.println("mang1: " + Arrays.toString(mang_doi_tuong));
		System.out.println("mang2: " + Arrays.toString(arr2));
		
		String[] arr3 = new String[mang_doi_tuong.length];
		System.arraycopy(mang_doi_tuong, 0, arr3, 0, mang_doi_tuong.length);
		arr3[0] = "thank you";
		
		System.out.println("mang1: " + Arrays.toString(mang_doi_tuong));
		System.out.println("mang3: " + Arrays.toString(arr3));
	}
	
}
