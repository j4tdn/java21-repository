package ex06;

import java.util.Scanner;

public class Ex06 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" Nhập K: ");
	Integer k = sc.nextInt();
	
	if(k%2==0) {
		int n = k/2;
		String n1 = String.valueOf(n);
		char[] nChar = n1.toCharArray();
		System.out.println(" Số thứ "+k+" trong dãy (1) là: "+nChar[0]);
	}
	if(k%2==1) {
		int n = (k-1)/2;
		String n1 = String.valueOf(n);
		char[] nChar = n1.toCharArray();
		System.out.println(" Số thứ "+k+" trong dãy (1) là: "+nChar[1]);
	}
}
}
