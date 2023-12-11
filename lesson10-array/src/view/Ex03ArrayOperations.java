package view;

import java.awt.geom.GeneralPath;
import java.util.Arrays;

import utils.ArrayUtils;

public class Ex03ArrayOperations {
	public static void main(String[] args) {

		// Cho mang s nguyen duong[1,20]
		//    Yeu cau
		// 1. Tim kiem nhung phan tu la so chan trong mang
		// 2. Tim kiem nhung phan tu la so le trng mang
		// 3. Tim kiem nhung phan tu la so nguyen to trong mang
		// 4. Tim kiem nhung phan tu la so hanh phuc trong mang
		
		int[] number= {2,7,13,24,17,19,35};
		
		ArrayUtils.generate("1.Even ", getEvenNumbers(number));
		ArrayUtils.generate("1.Even ", getNumbers(number, nb -> nb%2 ==0));
		
		ArrayUtils.generate("2.Odd ", getOddNumbers(number));
		ArrayUtils.generate("1.Even ", getNumbers(number, nb -> nb%2 !=0));
		
		ArrayUtils.generate("3.Prime ", getPrimeNumbers(number));
		ArrayUtils.generate("1.Even ", getNumbers(number, nb -> isPrime(nb)));
	}
	
	
	
	private static int[] getNumbers(int[] elements, IntCheck intcheck) {
		int[] target = new int[elements.length];
		int count =0;
		
		for(int element: elements) {
			if(element%2==0) {
				target[count++] = element;
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}
	
	
	
	
	
	private static int[] getEvenNumbers(int[] elements) {
		int[] target = new int[elements.length];
		int count =0;
		
		for(int element: elements) {
			if(element%2==0) {
				target[count++] = element;
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}
	private static int[] getOddNumbers(int[] elements) {
		int[] target = new int[elements.length];
		int count =0;
		
		for(int element: elements) {
			if(element%2!=0) {
				target[count++] = element;
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}
	
	private static int[] getPrimeNumbers(int[] elements) {
		int[] target = new int[elements.length];
		int count =0;
		
		for(int element: elements) {
			if(isPrime(element)) {
				target[count++] = element;
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}
	
	private static boolean isPrime(int number) {
		for(int i=2;i<=Math.sqrt(number);i++) {
			if(number%i==0) return false;
		}
		return true;
	}
}
