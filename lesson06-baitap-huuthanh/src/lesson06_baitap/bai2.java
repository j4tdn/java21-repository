package lesson06_baitap;

import java.util.Scanner;

public class bai2 {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Exception exception = new Exception();
		System.out.print("Nhập vào password của bạn: ");
		String arr = sc.nextLine();
		boolean check = true;
		while(check){
			if(
					  exception.numberOfCharacterPassFrom8To256(arr)
					&&exception.checkLeast1LowercaseAlphabeticCharater(arr)
					&&exception.checkLeast1UppercaseAlphabeticCharater(arr)
					&&exception.checkLeast1Number(arr)
					&&exception.checkLeast1SpecialCharacter(arr)
				) check=false;
			else {
				System.out.print("\nCần nhập lại: ");
				arr = sc.nextLine();
			}
		}
		 sc.close();
		System.out.println("PASSWORD của bạn là: " +arr);
	}
}
