package ex05.levelnumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class LevelNumber {
	static Random rd = new Random();
	 
	public static void main(String[] args) {
		Integer n = rd.nextInt(3,21);
		System.out.println("Mảng số nguyên gồm "+n+" phần tử là:");
		Integer[] arrs = new Integer[n];
		for(int i = 0; i < n; i++) {
			arrs[i] = rd.nextInt(1,100);
		}
		System.out.println(Arrays.toString(arrs));
		
	}
	public static void levelNum(Integer[] arrs) {
		for(Integer arr : arrs) {
			for(int i = 1; i <= arr; i++) {
				int count = 0;
				if(arr%i==0) {count++;};			
			}
			
		}
	}
}