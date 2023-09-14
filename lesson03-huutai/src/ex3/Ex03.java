package ex3;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập m(số hàng) = ");
		int m = Integer.parseInt(ip.nextLine());
		System.out.print("Nhập n(số côt) = ");
		int n = Integer.parseInt(ip.nextLine());
		
		int[] arr = new int[m*n];
//		for(int i = 0; i < m*n; i++) {
//			arr[i] = rd.nextInt(99) + 1;
//		}
		
		for(int i = 0; i < m*n; i++) {
			arr[i] = Integer.parseInt(ip.nextLine());
		}
		
		int max = 0;
		int min = 0;
		int k = 0;
		int col = 0;
		
		for(int i = 0; i < m; i++) {
			min = arr[i*m];
			max = 0;
			
			// tìm min của hàng và lấy index(k), cột(col)
			for(int j = 0; j < n; j++) {
				if(arr[i*n +j] <= min) {
					min = arr[i*n +j];
					k = i*n + j;
					col = j;
				}
			}
		//	System.out.println("min:"+ min + "--k = " + k + "col = " + col);
			
			// tìm max cột và so sánh với min
			for(int h = col; h < m*n; h+= n) {
				if(max < arr[h]) {
					max = arr[h];
				}
				if((max == min) && h == k) {
					System.out.println(arr[h]);
				}
			}
		//	System.out.println("max:"+ max);
		}
		
		ip.close();
	}
}
