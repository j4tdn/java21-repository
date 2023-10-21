package ex04;


import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		System.out.print("Input 0 <= n <= 999: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(readNumber(num));
	}

	private static String readNumber(int num) {
		
		String[] ones = {"", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín", "Mười",
						"Mười Một","Mười Hai", "Mười Ba", "Mười Bốn", "Mười Lăm", "Mười Sáu", "Mười Bảy", "Mười Tám", "Mười Chín" };
		
		String[] tens = {" ", "Mười", "Hai Mươi", "Ba Mươi", "Bốn Mươi", "Năm Mươi", 
						"Sáu Mươi", "Bảy Mươi", "Tám Mươi", "Chín Mươi" };
		
		String hundreds = "Trăm";
		
	
	}
}