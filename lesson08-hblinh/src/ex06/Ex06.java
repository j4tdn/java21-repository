package ex06;

import java.util.Scanner;

public class Ex06 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" Nhập K:  ");
	Integer k = sc.nextInt();
	String numString ="";
	for(int i = 1; i <=k; i++) {
		String number = String.valueOf(i);
		numString += number;
	}
	System.out.println("Số thứ k trong dãy (1) là: "+numString.charAt(k-1));
	}
}
