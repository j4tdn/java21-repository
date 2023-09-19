package Ex03NumArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class NumArray {

	int min = 0;
	int max = 0;
	
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	public static void main(String[] args) {
		
		System.out.println("Nhập số dòng của mảng");
		Integer m = sc.nextInt();
		System.out.println("Nhập số cột của mảng");
		Integer n = sc.nextInt();
		Integer[][] arr = new Integer [m][n];
		for(int i = 0; i<m; i++) {
			for(int j = 0; j <n; j++) {
				Integer c = rd.nextInt(1,100);	
				arr[i][j] =c;	
		
			}
		
		}
		
	}
	public void checkMinRow(Integer[][] arr, int m, int n) {
		
		for(int i = 0; i < m; i++) {
			int min = arr[0][0];
			for(int j = 0; j < n; j++) {
				if(arr[i][j]<min) {
					arr[i][j]= min;
				}
				checkMax();
			}
			return;
		}
	}
public void checkMaxColom(Integer[][] arr, int m, int n) {
		
		for(int i = 0; i < m; i++) {
			int min = arr[0][0];
			for(int j = 0; j < n; j++) {
				if(arr[i][j]<min) {
					arr[i][j]= min;
					
				}
				return arr[]
			}
			return;
		}
	}
	
}
