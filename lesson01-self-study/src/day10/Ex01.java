package day10;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		int[] a  = new  int[] {1,8,2,4,9};
		int[] b = new int[15];
		
		Arrays.sort(a);
		System.out.println("mang a sau khi sap xep" + Arrays.toString(a));
		
		//ham tim kiem
		System.out.println("Tim vi tri so 4: " + Arrays.binarySearch(a, 4));
		System.out.println("Tim vi tri so 0: " + Arrays.binarySearch(a, 0));
		
		//ham dien gia tri
		Arrays.fill(b, 111);
		System.out.println("mang b: " + Arrays.toString(b));
		
		// sap xep giam dan
		a = reverse(a);
		System.out.println("mang a theo thu tu giam dan:" + Arrays.toString(a));
		
		
	}
	
	private static int[] reverse(int[] a) {
		int[] rs = new int[a.length];
		int count = 0;
		for(int i = a.length-1; i >= 0; i--) {
			rs[count++] = a[i];
		}
		return rs;
	}
}
