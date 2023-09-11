package lesson02;

import java.util.Scanner;

public class Ex07BaseConvert {
	
	public static void main(String[] args) {
		int n,b;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter value: ");
		n = ip.nextInt();
		System.out.println("Enter base: ");
		b = ip.nextInt();
		
		System.out.println("Result: " + convertDecToBin(n,b));
		ip.close();
	}
	
	
	private static String convertDecToBin(int n, int b) {
		StringBuilder stringBuilder = new StringBuilder();		
		int remainder = 0;
		String binary = "01";
		
		while(n > 0) {
			remainder = n % b;
			n /= b;
			stringBuilder.append(binary.charAt(remainder));
		}
		return stringBuilder.reverse().toString();
	}
	
	
}
