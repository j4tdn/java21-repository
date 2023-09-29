package ex02.number;

import java.util.Scanner;

public class NumberDivSeFi {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int k = 0;
		System.out.println("Tạo dãy số nguyên gốm N chữ số");
		System.out.println("Vui lòng nhập giá trị N: ");
		int n = sc.nextInt();
		int l = n-1;
		Integer[] arrs = new Integer[n];
		Integer[] arrNumbers = new Integer[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhập số thứ "+(i+1));
			Integer num = sc.nextInt();
			arrs[i] = num;	
		}
		for(Integer arr : arrs) {
			if(arr%7==0&&arr%5!=0) {
				arrNumbers[k] = arr;
				k++;
			}
		}
		for(Integer arr : arrs) {
			if(arr%5==0&&arr%7!=0) {
				arrNumbers[l] = arr;
				l--;
			}	
		}
		for(Integer arr : arrs) {
			if((arr%5!=0&&arr%7!=0)||(arr%5==0&&arr%7==0)) {
				arrNumbers[k] = arr;
				k++;
			}
		}
			System.out.print("Output: ");
			for(int i = 0; i < n; i++) {	
				if(i<n-1) {System.out.print(arrNumbers[i]+", ");}
				else {System.out.print(arrNumbers[i]);}
			}
		
	}
}
