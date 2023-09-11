package controlling;

import java.util.Scanner;

public class Ex05DoWhile {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
	 // lựa chọn
	 
	 // 1 -- chức năng A
	 // 2 -- chắc năng B
	 // 3 -- Chức năng C
	 // 4 -- Thoát
		 while (true) {
			 exportmenu();
				System.out.println("Chọn (1-4)");
				String option = ip.nextLine();
				if (isValidSelection(option)) {
					switch (option) {
					case "1": {
						System.out.println("Thực hiện chức năng A...");
						break;
					}
					case "2": {
						System.out.println("Thực hiện chức năng B...");
						break;
					}
					case "3": {
						System.out.println("Thực hiện chức năng C...");
						break;
					}
					case "4": {
						System.out.println("Tắt chương trình...");
						return;
					}
					}
				}
			 
			 
		 }
		

		
		//Kiểm tra tính hợp lễ của 1 chuỗi nhập vào
	}
	
	private static boolean isValidSelection(String option) {
		return option.equals("1")||
				option.equals("2")||
				option.equals("3")||
				option.equals("4");
	}
	private static void exportmenu() {
		System.out.println("**Mời chọn chức năng**\n"
				+ "   1. Chức Năng A\n"
				+ "   2. Chức Năng B\n"
				+ "   3. Chức Năng C\n"
				+ "   4. Thoát \n");
	}
}
