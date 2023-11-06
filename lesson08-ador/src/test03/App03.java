package test03;

import static ultils.StringUltils.*;

import java.util.Scanner;

public class App03 {
	public static void main(String[] args) {
//		String str1Debug = "Em có yêu anh không anh để anh biết còn chờ";
//		String str2Debug = "Em xin lỗi em đã có thái độ không đúng với anh";
		
		String yourStr = inputYourString();
		
		// Change to Not Accented by way1
		System.out.println("\n****************** Chuyển đổi bằng cách 1 ******************");
		System.out.println("Gốc: " + yourStr + "\nChuyển đổi --> " + toNotAccentedWay1(yourStr));
//		System.out.println("\nGốc: " + str2Debug + "\nChuyển đổi --> " + toNotAccentedWay1(str2Debug));
		
		// Change to Not Accented by way2
		System.out.println("\n****************** Chuyển đổi bằng cách 2 ******************");
		System.out.println("Gốc: " + yourStr + "\nChuyển đổi --> " + toNotAccentedWay2(yourStr));
//		System.out.println("\nGốc: " + str2Debug + "\nChuyển đổi --> " + toNotAccentedWay2(str2Debug));
	}
	private static String inputYourString() {
		Scanner ip = new Scanner(System.in);
		String yourString = "";
		System.out.print("Mời nhập chuỗi: ");
		yourString = ip.nextLine();
		ip.close();
		return yourString;
	}
}
