package menu;

import java.util.Scanner;

public class Ex01Menu {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
//		Exportmenu();
//		System.out.println("Nhập từ 1-4:");
//		String option = ip.nextLine();
		
		
		do {
			Exportmenu();
			System.out.println("Nhập từ 1-4:");
			String option = ip.nextLine();
			if(isValidSeclection(option)) {
				switch (option) {
				case "1": {
					System.out.println("Chức năng A...loading");
					break;
				}
				case "2": {
					System.out.println("Chức năng B...loading");
					break;
				}
				case "3": {
					System.out.println("Chức năng C...loading");
					break;
				}
				case "4": {
					System.out.println("Chức năng D...loading");
					return;
				}
				
				}
			}
		} while (true);
		
		
		
	
	}
	
	public static boolean isValidSeclection(String option) {
			return  option.equals("1")||
					option.equals("2")||
					option.equals("3")||
					option.equals("4");
		}
	public static void Exportmenu() {
		System.out.println(
				"*** Mời chọn chức năng ***\n"
				+ "    1. Chức năng A\n"
				+ "    2. Chức năng B\n"
				+ "    3. Chức năng C\n"
				+ "    4. Chức năng D\n"
				+ "*** =====    =====***"
				);
	}
}
