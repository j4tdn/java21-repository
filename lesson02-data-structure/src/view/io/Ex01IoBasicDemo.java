package view.io;

import java.util.Scanner;

public class Ex01IoBasicDemo {
	public static void main(String[] args) {
		
		// system.in --> nhập từ bàn phím.
		Scanner ip = new Scanner(System.in);
		
		// Phân biệt nhập với:
		
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
		
		
		System.out.println("\n****________--------______****");
		
		System.out.println("1 --> SBD = " + id);
		System.out.println("2 --> Tài Khoản: " + username);
		System.out.println("3 --> Mật khẩu: " + password);
		System.out.println("4 --> Tuổi: " + age);
		System.out.println("5 --> ĐTB = " + avgPoint);
		
		System.out.println("****________--------______****");
		
		// close connection
		ip.close();
		
	}
}
