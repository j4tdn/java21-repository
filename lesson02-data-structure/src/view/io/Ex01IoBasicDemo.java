package view.io;

// khi class A sử dụng code từ thư viện của JRE

import java.util.Scanner;

public class Ex01IoBasicDemo {
	public static void main(String[] args) {
		
		// System.in --> nhập từ bàn phím
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập SBD: ");
		String id = ip.nextLine();
		
		/* phân biệt nhập với
		 * string: 
		 * 		+ k nhập gì: enter --> lưu chuỗi rỗng vào biến
		 * 		+ nhập	   : enter --> lưu giá trị vừa nhập vào biến
		 * 
		 * !string:
		 * 		+ k nhập gì: enter --> k thực hiện thao tác, khi nào nhập thì enter mới hiệu nghiệm
		 *  	+ nhập	   : enter --> lưu giá trị vừa nhập vào biến

		 */
		
		System.out.print("Nhập tài khoản: ");
		String username = ip.nextLine();
		
		System.out.print("Nhập mật khẩu: ");
		String password = ip.nextLine();
		
		System.out.print("Nhập tuổi: ");
		int age = Integer.parseInt(ip.nextLine()); // -> nhập kiểu này cho an toàn nếu nhập tiếp là string
		// int age = ip.nextInt();
		
		System.out.print("Nhập điểm trung bình: ");
		double avgPoint = Double.parseDouble(ip.nextLine());
		
		System.out.println("** __ ---- __ **");
		
		System.out.println("1 --> SBD: " + id);
		System.out.println("2 --> Tài khoản: " + id);
		System.out.println("3 --> mật khẩu: " + id);
		System.out.println("4 --> tuổi: " + id);
		System.out.println("5 --> điểm trung bình: " + id);


		
		// close connection
		ip.close();
	}
}
