package view.io;

import java.util.Scanner;

public class Ex01ToBasicDemo {
	
	public static void main(String[] args) {
		// System.in --> nhập từ bàn phím
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhập SBD");
		String id = ip.nextLine();
		
		System.out.println("Nhập tài khoản");
		String usernameString = ip.nextLine();
		
		System.out.println("Nhập mật khẩu");
		String passwordString = ip.nextLine();
		
		System.out.println("Nhập tuổi");
		double age = Integer.parseInt(ip.nextLine()); // dùng Parse để fix lỗi khoảng trống
		
		System.out.println("Nhập ĐTB: ");
		double avgPoint = Double.parseDouble(ip.nextLine());
		
		System.out.println("**__-----__**");
		
		// close connection
		ip.close();
	}
	
}

