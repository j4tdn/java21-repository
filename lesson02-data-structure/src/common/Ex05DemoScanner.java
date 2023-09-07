package common;

import java.util.Scanner;

public class Ex05DemoScanner {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập SBD");
		String id = ip.nextLine();
		
		System.out.println("Họ và tên");
		String username = ip.nextLine();
		
		System.out.println("Nhập SDT");
		String numberPhone = ip.nextLine();
		
		System.out.println("Nhập tuổi");
		Integer age  = ip.nextInt();
		
		System.out.println("Nhập điểm");
		Double avgPoint  = ip.nextDouble();
		
//		System.out.println("Nhập tuổi");
//		int age = Integer.parseInt(ip.nextLine());
//		
//		System.out.println("Nhập ĐTB");
//		double avgPoint = Integer.parseInt(ip.nextLine());
		ip.close();
	}
}
