package io;
//class A sử dụng code từ thư viện của Java JRE
import java.util.Scanner;

public class Ex01IoBasicDemo {
 public static void main(String[] args) {
	 //System.in --> nhập từ bàn phím
	Scanner ip = new Scanner(System.in);
	
	// nextLine -- nhập chuỗi -- String
	// nextInt -- nhập số nguyên -- int
	// nextDouble -- nhập số thực -- double
	
	// Phân biệt nhập với
	
	// string
	// không nhập gì -- nhấn Enter -- lưu chuỗi vào biến
	// nhập -- nhấn enter -- lưu giá trị vừa nhập vào biến
	
	//!string (int, double, float) ( không phải kiểu string)
	// không nhập gì -- nhấn enter -- không thực hiện thao tác, đợi cho đến khi có dữ liệu tiếp mới thực thi
	// nhập -- nhấn enter -- lưu giá trị vừa nhập vào biến
	System.out.print("Nhập SBD: ");
	String id = ip.nextLine();
	System.out.print("Nhập Tài Khoản: ");
	String username = ip.nextLine();
	
	System.out.print("Nhập Mật khẩu: ");
	String password = ip.nextLine();
	
	System.out.print("Nhập Tuổi: ");
	int age = Integer.parseInt(ip.nextLine());
	
	System.out.print("Nhập ĐTB: ");
	double avgPoint = Double.parseDouble(ip.nextLine());
	
	System.out.println("**__---__***");
	System.out.println("1 -->SBD: " +id);
	System.out.println("2 -->Tài khoản: " +username);
	System.out.println("3 -->Mật Khẩu: " +password);
	System.out.println("4 -->Tuổi: " +age);
	System.out.println("5 -->ĐTB: " +avgPoint);
	
	//close connection
	ip.close();
}
}
