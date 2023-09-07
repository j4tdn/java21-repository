package view.io;

import java.util.Scanner;

public class Ex01IoBasicDemo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập SBD:");
		String id = ip.nextLine();
		
		System.out.println("Nhập Tài khoản:");
		String username = ip.nextLine();
		
		System.out.println("Nhập Mật khẩu:");
		String password = ip.nextLine();
		
		System.out.println("Nhập tuổi:");
		int age = Integer.parseInt(ip.nextLine());
		
		System.out.println("Nhập ĐTB:");
		double avgPoint = Double.parseDouble(ip.nextLine());
		
		System.out.println("**___**___**");
		
		
		ip.close();
	}
}
