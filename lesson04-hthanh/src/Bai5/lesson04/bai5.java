package Bai5.lesson04;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class bai5 {
	public static int check( int arr[] , int n) {
		Random rd = new Random();
		boolean checkk = true;
		int test=0;
		while(checkk) {
		 test = rd.nextInt(3, 100);
		 checkk = false;
		for(int i=0;i<n;i++) {
			if (arr[i] == test) {
				checkk= true;
			}
			
		}
		 
		}
		return test;
	}

	public static int count(int n) {
		int s=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) s=s+1;
		}
		return s+2;
	}
	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(3, 100);
		System.out.println(n);
		int[] arr = new int[n];
		int[] arr2 = new int [n];
		int[] arr3 = new int [n];
		for (int i = 0; i < n; i++) {
			arr[i] = check(arr, i);
		}
		System.out.println("Mảng số Nguyên: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		for(int i=0;i<n;i++) {
			arr2[i] = count(arr[i]);
		}
	
//		System.out.println();
//		for (int i=0;i<n;i++) {
//			System.out.print(arr2[i]+" ");
//		}
		int k=0;
		for(int i=2;i<n;i++) {
			for(int j=0;j<n;j++)
				if(arr2[j]==i) {
					arr3[k]=arr[j];
					k=k+1;
				}
		}
		System.out.println();
		System.out.println("Kết quả sau khi sắp xếp: ");
		for (int i=0;i<n;i++) {
			System.out.print(arr3[i]+" ");
		}
	}
}
