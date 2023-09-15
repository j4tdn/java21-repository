package lesson02_ducthinh;

import java.util.Scanner;

public class lesson02_ducthinh {
	static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		inputArr(arr);
		displayArr(arr);
		if(checkHorstElement(arr)) {
			System.out.println("Mảng trên có phần tử yên ngựa");
		}else {
			System.out.println("Mảng trên không có phần tử yên ngựa");
		}
	}
	public static void inputArr(int[][] arr) {
		for(int i = 0;i < arr.length;i++ ) {
			for(int j = 0;j < arr[0].length;j++) {
				System.out.println("Input elements arr["+i+"]["+j+"]:  " );
				arr[i][j] = ip.nextInt();
			}
			
		}	
	}
	public static void displayArr(int[][] arr) {
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[0].length;j++) {
				System.out.print(""+arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static boolean checkHorstElement(int[][] arr) {
		for(int i=0;i < arr.length;) {
			for(int j=0;j < arr[0].length; j++) {
				int element = arr[i][j];
				boolean check = true;
				// kiểm tra phần tử có là nhỏ nhất trong hàng
				for(int c = 0;c < arr[0].length;c++) {
					if(arr[i][c] < element) {
						check = false;
					}
				}
				// Kiểm tra phần tử có là lớn nhất trong cột
				for(int k = 0;k < arr.length;k++) {
					if(arr[k][j] > element) {
						check = false;
					}
				}
				if (check) {
					return true;
				}
			}
		}
		return false;
	}
	
}
