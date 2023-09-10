package view.io;

// khi 1 class A sử dụng code từ thư viện của JRE

import java.util.Scanner;

public class Ex01IoBasicDemo {
	public static void main(String[] args) {
		// system.in --> nhập từ bàn phím
		Scanner ip = new Scanner(System.in);
		
		// nextLine --> nhập chuỗi --> String
		// nextInt --> nhập số nguyên --> int
		// nextDouble --> nhập số thực --> double
		
		// phân biệt nhập với
		
		// string
		// không nhập gì --> nhấn enter --> lưu chuỗi rỗng vào biến
		// nhập --> nhấn enter --> lưu giá trị vừa nhập vào biến
		
		// !string(int, double, float)
		// không nhập gì --> nhấn enter --> không thực hiện thao tác, đợi cho đến khi nhập gì đó thì enter mới hiệu nghiệm
		// nhập --> nhấn enter --> lưu giá trị vừa nhập vào biến
		
		System.out.print("Nhập SBD: ");
		String id = ip.nextLine();
		
		System.out.print("Nhập Tài khoản: ");
		String username = ip.nextLine();
		
		System.out.print("Nhập mật khẩu: ");
		String password = ip.nextLine();
		
		System.out.print("Nhập tuổi: ");
		int age = Integer.parseInt(ip.nextLine());
		
		System.out.print("Nhập ĐTB: ");
		double avgPoint = Double.parseDouble(ip.nextLine());
		
		System.out.println("** __ ---- __***");
		
		System.out.println("1 --> SBD = " + id);
		System.out.println("2 --> Tài khoản = " + username);
		System.out.println("3 --> mật khẩu = " + password);
		System.out.println("4 --> tuổi = " + age);
		System.out.println("5 --> ĐTB = " + avgPoint);
		
		System.out.println("** __ ---- __***");
		
		// close connection
		ip.close();
		
	}

}
