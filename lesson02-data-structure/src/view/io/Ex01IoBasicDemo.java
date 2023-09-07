package view.io;

//class A sử dụng code thư viện của Java 
import java.util.Scanner;

public class Ex01IoBasicDemo {
	public static void main(String[] args) {
		
		//System.in --> nhập từ bàn phím
		Scanner ip = new Scanner(System.in);
		
		// nextline 	--> nhập chuỗi 		--> string
		// nextInt 		--> nhập số nguyên 	--> int
		// nextDouble 	--> nhập số thực 	--> double
		
		//string:
		//ko nhập gì --> nhấn enter --> lưu chuỗi rỗng vào biến
		//nhập --> nhấn enter --> lưu giá trị vừa nhập vào biến 
		
		//!string(int, double, float)
		//ko nhập gì --> nhấn enter -->ko thực hiện thao tác, đợi cho đến khi nhập gì đó thì enter mới hiệu nghiệm
		//nhập --> nhấn enter --> lưu giá trị vừa nhập vào biến 
		
		System.out.print("nhập SBD: ");
		String id = ip.nextLine();
		
		System.out.print("nhập tuổi: ");
		int age = Integer.parseInt(ip.nextLine());
		
		System.out.print("nhập tài khoản: ");
		String username = ip.nextLine();
		
		System.out.print("nhập mật khẩu: ");
		String password = ip.nextLine();
		
		System.out.print("nhập ĐTB: ");
		double avgPoint = Double.parseDouble(ip.nextLine());
		
		System.out.println("\n**__----__**");
		
		System.out.println("1. SBD = " + id);
		System.out.println("2. tài khoản = " + username);
		System.out.println("3. mật khẩu = " + password);
		System.out.println("4. tuổi = " + age);
		System.out.println("5. ĐTB = " + avgPoint);
		
		System.out.println("**__----__**");
		
		//close connection
		ip.close();
	}

}
