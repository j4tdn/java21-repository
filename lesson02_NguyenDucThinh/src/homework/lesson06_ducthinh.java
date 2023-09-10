package homework;

import java.util.Random;
import java.util.Scanner;

public class lesson06_ducthinh {
	public static int inputNumber(Scanner ip) {
		
		int num = 0;
		int inputAgainCount = 5;
		while(inputAgainCount > 0) {
			try {
				
				num = Integer.parseInt(ip.nextLine());
				if(num <= 0 || num >= 20) {
					System.out.println("N must be positive number in range[0;20), please input again!");					
				}else {
					return num;
				}
			}catch(Exception e) {
				System.out.println("N must be positive number in range[0,20): ");
				ip.nextInt();
				
				
			}
			inputAgainCount--;
			System.out.println("you have "+inputAgainCount+" times to input again");
		}
		System.out.println("Exceeded maximum number of attempts. Exiting program.");
        return num; 
	}
	public static void main(String[] args) {
		int[] arr = new int[3];
		Scanner ip = new Scanner(System.in);
		inputArr(arr, ip);
		System.out.println("Số lớn nhất là : "+findMax(arr));
		System.out.println("Số nhỏ nhất là : "+findMin(arr));

	}
	public static void inputArr(int[] arr, Scanner ip) {
		
		for(int i=0; i < arr.length; i++) {
			System.out.println("Input value element "+(i+1)+ ": ");
			arr[i] = inputNumber(ip);
		}
		
	}
	public static int findMax(int[] arr) {
		int max = arr[0];
		for(int i=0; i < arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i=0; i < arr.length; i++) {
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
}
