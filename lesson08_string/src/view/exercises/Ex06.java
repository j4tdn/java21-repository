package view.exercises;

import java.util.Scanner;

public class Ex06 {
		public static void main(String[] args) {
			Scanner ip = new Scanner(System.in);
			String c = "";
			
			for (int i = 1; i < 50; i++) {
				c += "" + i;
			}
			System.out.println(c);
			System.out.println("Nhập vị trí : ");
			int k = ip.nextInt();
			
			System.out.println("Vị trí thứ " + k + " là: " + c.charAt(k - 1));
		}
}
