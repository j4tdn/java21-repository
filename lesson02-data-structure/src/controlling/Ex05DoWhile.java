package controlling;

import java.util.Scanner;

public class Ex05DoWhile {
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		//lựa chọn
		
		// 1 -> chức năng A
		
		// 2 -> chức năng B
		
		// 3 -> chức năng C
		
		// 4 -> thoát
		
		exportMenu();
		
		
	}
	
	private static void exportMenu() {
		System.out.println(
				"*** Mời chọn chức năng ***\n"
				+ "    1. chức năng A\n"
				+ "    2. chức năng B\n"
				+ "    3. chức năng C\n"
				+ "    4. thoát\n"
				+"*** =============== ***\n"
				);
	}
}
