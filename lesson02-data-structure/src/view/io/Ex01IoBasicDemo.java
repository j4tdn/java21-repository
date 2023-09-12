package view.io;

// class A sử dụng code từ thư viện của JRE
import java.util.Scanner;

public class Ex01IoBasicDemo {

	public static void main(String[] args) {
		// System.in --> nhập từ bàn phím
		Scanner ip = new Scanner(System.in);
		
		// nextline   --> nhập chuỗi     --> String	
		// nextInt    --> nhập số nguyên --> int
		// nextDouble --> nhập số thực   --> double
		
		// phân biệt nhập với
		
		// string:
		// ko nhập gì --> nhấn enter --> lưu chuỗi rỗng vào biến
		// nhập       --> nhấn enter --> lưu giá trị vừa nhập vào biến
		
		// !string(int, double, float)
		// ko nhập gì --> nhấn enter --> ko thực thi thao tác,đợi cho dến khi nhập gì đó thì enter mới hiệu nghiệm
		// nhập --> nhấn enter --> lưu giá trị vừa nhập vào biến
		
		System.out.print("Nhập SBD: ");
		String id = ip.nextLine();

		
		System.out.print("Nhập Tuổi: ");
		// tránh hiện tượng trôi lệnh,
		int age = Integer.parseInt(ip.nextLine());
		
		
		System.out.print("Nhập Tài Khoản: ");
		String username = ip.nextLine();
		
		System.out.print("Nhập Mật Khẩu: ");
		String password = ip.nextLine();
		

		System.out.print("Nhập ĐTB : ");
		Double avgPoint = Double.parseDouble(ip.nextLine());
		
		System.out.println("\n**__----__**");
		
		System.out.println("1 --> SBD = " + id);
		System.out.println("2 --> Tài Khoản = " + username);
		System.out.println("3 --> Mật Khẩu = " + password);
		System.out.println("4 --> Tuổi = " + age);
		System.out.println("5 --> ĐTB = " + avgPoint);
		
		System.out.println("\n**__----__**");
		
		//close connection
		ip.close();
		
	}	
}