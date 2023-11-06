package test02;

import static ultils.StringUltils.*;

import java.util.Scanner;

import ultils.StringValidExceptionUltils;

public class App02 {
	public static void main(String[] args) {
		String yourName = inputYourString();
		
		System.out.println("************** Họ và tên đã được định dạng lại thành ***************");
		System.out.println("       >>" + yourName + "<< --> >>" + formatName(yourName) + "<<");
	}
	private static String formatName(String yourName) {
		String fomattedName = "";
		String[] tocken = yourName.strip().replaceAll("\\s+", " ").toLowerCase().split(" ");
		
		for (int i = 0; i < tocken.length; i++) {
			char capLeter = Character.toUpperCase(tocken[i].charAt(0));
			fomattedName += capLeter + tocken[i].substring(1) + " ";
		}
		return fomattedName.strip();
	}
	
	private static String inputYourString() {
		Scanner ip = new Scanner(System.in);
		String yourName = "";
		System.out.print("Mời nhập tên của bạn: ");
		do {
			yourName = ip.nextLine();
			try {
				isValidString(yourName);
				break;
			} catch (StringValidExceptionUltils e) {
				System.out.println(e.getMessage());
				System.out.print("\nMời nhập lại tên của bạn: ");
			}
			
			
		} while (true);
		
		ip.close();
		return yourName;
	}
	
	private static void isValidString(String yourName) throws StringValidExceptionUltils {
		yourName = yourName.strip().replaceAll("\\s+", " ");
		// String có chứa tiếng việt không?
		if(isContainsVNChar(yourName)) {
			throw new StringValidExceptionUltils("!!! Không được phép nhập tên TIẾNG VIỆT có dấu !!!");
		}
		// String có chứa số hay không ?
		if(verifyExistNumber(yourName)) {
			throw new StringValidExceptionUltils("!!! Tên KHÔNG được phép có các kí tự số từ 0~9 !!!");
		}
		// String có chứa các kí tự đặc biệt
		if(verifyExistSpecialSymbols(yourName)) {
			throw new StringValidExceptionUltils("!!! Tên KHÔNG được phép có các kí tự đặc biệt @,$,%... !!!");
		}
		// String có chứa khoảng trắng không ?
		if(!verifyExistBlank(yourName)) {
			throw new StringValidExceptionUltils("!!! Các từ cách nhau ít nhất MỘT KHOẢNG TRỐNG !!!");
		}
	}
}
