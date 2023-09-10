package homework;

import java.util.Random;

public class lesson04_ducthinh {
	public static double facOfNumber(int n ) {
		double fac = 1;
		for(int i = n; i != 0; i--) {
			fac *= (double)i;
		}
		return fac;
	}
	public static void main(String[] args) {
		int[] arr =new int[4];
		randomArr(arr);
		System.out.println("Factorial total of Arrar's elements : "+ facOfNumber(arr[0]) + facOfNumber(arr[1]) 
																	+ facOfNumber(arr[2]) + facOfNumber(arr[3]));
	}
	public static void randomArr(int[] arr) {
		Random rd = new Random();
		for(int i=0; i < arr.length; i++) {
			arr[i] = rd.nextInt(10, 21);
			System.out.println(" "+arr[i]);
		}
		
	}
}
