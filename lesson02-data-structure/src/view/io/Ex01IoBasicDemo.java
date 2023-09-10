package view.io;

// class A sử dụng code từ thư viện của JRE

import java.util.Scanner;

public class Ex01IoBasicDemo {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		// phân biệt nhập với
		
		// string:
		// ko nhập gì --> nhấn enter --> lưu chuỗi rỗng vào biến
		// nhập --> nhấn enter --> lưu giá trị vừa nhập vào biến
		
		// !string(int, double, float)
		// ko nhập gì --> nhấn enter --> ko thực hiện thao tác, đợi cho đến khi nhập gì đó thì enter
		
		
		System.out.print("Nhập SBD: ");
		String id = ip.nextLine();
		
		System.out.print("Nhập tài khoản: ");
		String username = ip.nextLine();
		
		System.out.print("Nhập mật khẩu: ");
		String password = ip.nextLine();
		
		System.out.print("Nhập tuổi: ");
		int age = ip.nextInt();
		
		System.out.print("Nhập ĐTB: ");
		double avgPoint = ip.nextDouble();
		
		System.out.println("\n**__----__**");
		
		System.out.println("1 --> SBD = " +id);
		System.out.println("2 --> Tài Khoản = " +username);
		System.out.println("3 --> Mật Khẩu = " +password);
		System.out.println("4 --> Tuổi = " +age);
		System.out.println("5 --> ĐTB = " +avgPoint);
		
		System.out.println("\n**__----__**");
		
		// close connection
		ip.close();
		
	}

}
