package view.io;

import java.util.Scanner;

public class Ex01IoBasicDemo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhập SBD: ");
		String id = ip.nextLine();
		
		System.out.println("Nhập TK: ");
		String username = ip.nextLine();
		
		System.out.println("Nhập MK: ");
		String password = ip.nextLine();
		
		System.out.println("Nhập age: ");
		int age = ip.nextInt();
		
		System.out.println("Nhập Avg point: ");
		double point = ip.nextDouble();
		
		System.out.println("Id: " + id);
		System.out.println("Username: " + username);
		System.out.println("Mk: " + password);
		System.out.println("Tuổi: " + age);
		System.out.println("Điểm: " + point);
		
		ip.close();
	}
}
