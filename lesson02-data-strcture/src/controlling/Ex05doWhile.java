package controlling;

import java.util.Scanner;

public class Ex05doWhile {
	private static void menu() {
		System.out.println("chon chuc nang\n" + "chuc nang A\n" + "chuc nang B\n" + "chuc nang C\n" + "thoat\n");
	}

	private static boolean isValidSelection(String option) {
		return option.equals("1") || option.equals("2") || option.equals("3") || option.equals("4");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		do {
			menu();
			System.out.println("chon 1->4");
			String option = sc.nextLine();
			if(isValidSelection(option)) {
				switch (option) {
				case "1" : {
					System.out.println("chuc nang 1: ");
					break;
				}
				case "2" : {
					System.out.println("chuc nang 2: ");
					break;
				}
				case "3" : {
					System.out.println("chuc nang 3: ");
					break;
				}
				case "4" : {
					System.out.println("thoat chuong trinh: ");
					return;
				}
				}
			}
		} while (true);
	}
}
