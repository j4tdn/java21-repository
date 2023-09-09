package controlling;

import java.util.Scanner;

public class Ex04DoWhile {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		// Lựa Chọn
		// 1 --> Chức Năng A
		// 2 --> Chức Năng B
		// 3 --> Thoát
		exportMenu();
		System.out.println("Chọn(1-4): ");
		int option = Integer.parseInt(ip.next());

	}

	private static boolean isValidSelection(String option) {
		  return option.equals("1") 
				|| option.equals("2") 
				|| option.equals("3") 
				|| option.equals("4");
	}

	private static void exportMenu() {

		System.out.println("***Mời chọn chức năng ***\n" + "1.Chức năng a\n" + "2.Chức năng b\n" + "3.Chức năng c\n"
				+ "4.Thoát\n");
	}
}
