package ex03.pascaltriangle;

import java.util.Scanner;

public class PascalTrigangle {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Nhập giá trị N: ");
		Integer n = sc.nextInt();
		Integer[] result = {1,1};
		for(int k = 0; k <= n; k++) {
			Integer[] arrs = new Integer[k+2];
			arrs[0] = 1;
			arrs[k+1] = 1;
			for(int i = 1; i <= k; i++ ) {
				arrs[i] = result[i-1]+result[i];		
			}
			result = arrs;
			for(Integer arr : arrs) {
				System.out.print(arr+" ");
			}
			System.out.println("\n");
		}	
	}
}
	

