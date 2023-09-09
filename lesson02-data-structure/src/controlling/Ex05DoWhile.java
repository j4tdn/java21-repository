package controlling;

import java.util.Scanner;

public class Ex05DoWhile {
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		// Lựa chọn
		
		// 1 -> Chức năng A
		
		// 2 -> Chức năng B
		
		// 3 -> Chức năng C
		
		// 4 --> Thoát
		
		do {
			exportMenu();
			System.out.print("Chọn(1-4): ");
			String option = ip.nextLine();
			if (isValidSelection(option)) {
				switch (option) {
					case "1": {
						System.out.println("Thực hiện chức năng A ....");
						break;
					}
					case "2": {
						System.out.println("Thực hiện chức năng B ....");
						break;
					}
					case "3": {
						System.out.println("Thực hiện chức năng C ....");
						break;
					}
					case "4": {
						System.out.println("Thoát chương trình ....");
						return;
					}
				}
			}
		} while(true);
		
		// System.out.println("\nKết thúc");
	}
	
	private static boolean isValidSelection(String option) {
		return option.equals("1") || 
				   option.equals("2") || 
				   option.equals("3") || 
				   option.equals("4");
	}
	
	private static void exportMenu() {
		System.out.println(
				  "*** Mời chọn chức năng ***\n"
				+ "    1. Chức năng A\n"
				+ "    2. Chức năng B\n"
				+ "    3. Chức năng C\n"
				+ "    4. Thoát\n"
				+ "*** ================== ***\n"
				
		);
	}
	
}
