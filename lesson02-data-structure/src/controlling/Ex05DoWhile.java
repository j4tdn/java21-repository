package controlling;

import java.util.Scanner;

public class Ex05DoWhile {
	
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		exportMenu();
		

	}
	private static void exportMenu() {
		System.out.println(
				"*** Mời chọn chức năng ***\n"
			  + "*** 1. Chức năng A 	***\n"
			  + "*** 2. Chức năng B 	***\n"
			  + "*** 3. Chức năng C 	***\n"
			  + "*** 4. Thoát 		***\n"

				);
	}
}