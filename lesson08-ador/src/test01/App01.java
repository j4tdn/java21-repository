package test01;

import static ultils.StringUltils.*;

import java.util.Scanner;

import ultils.StringValidExceptionUltils;
public class App01 {
	public static void main(String[] args) {
		String yourString = inputYourString();
//		String yourString = "anh yêu em ";
		yourString = yourString.strip();
		System.out.println("**************** Các ký tự trên dòng ****************");
		for (int i = 0; i < yourString.length(); i++) {
			System.out.print("|" + yourString.charAt(i) + "|\n");
		}
		
		String[] words = yourString.strip().split("\\s+");
		
		System.out.println("**************** Mỗi từ trên dòng *************");
		for (String word:words) {
			System.out.println(word);
		}
		
		System.out.println("**************** Chuỗi đảo ngược ký tự *************");
//		for (int i = yourString.length() - 1; i >= 0; i--) {
//			System.out.print(yourString.charAt(i));
//		}
		System.out.println("|" + new StringBuffer(yourString).reverse().toString() + "|");
		
		String reverStce = "";
		System.out.println("**************** Chuỗi đảo ngược từ *************");
		for (int i = words.length - 1; i >= 0; i--) {
			reverStce += words[i] + " ";
		}
		reverStce = reverStce.strip();
		System.out.print("|" + reverStce + "|");
	
	}
	private static String inputYourString() {
		Scanner ip = new Scanner(System.in);
		String yourString = "";
		System.out.println("*** Nhập chuỗi tiếng việt có chứa dấu và khoảng trống ***");
		System.out.print("Mời nhập chuỗi: ");
		do {
			yourString = ip.nextLine();
			try {
				isValidString(yourString);
				break;
			} catch (StringValidExceptionUltils e) {
				System.out.println(e.getMessage());
				System.out.print("\nMời nhập lại chuỗi: ");
			}
			
			
		} while (true);
		
		ip.close();
		return yourString;
	}
	
	private static void isValidString(String yourStr) throws StringValidExceptionUltils {
		// chuỗi có bao gồm ký tự có dấu không?
		if(!isContainsVNChar(yourStr)) {
			throw new StringValidExceptionUltils("!!! Hãy nhập chuỗi tiếng việt có DẤU !!!");
		}
		// có chứa khoảng trắng không ?
		yourStr = yourStr.strip().replaceAll("\\s+", " ");
		if(!verifyExistBlank(yourStr)) {
			throw new StringValidExceptionUltils("!!! Các từ cách nhau ít nhất MỘT KHOẢNG TRỐNG !!!");
		}
	}
}
