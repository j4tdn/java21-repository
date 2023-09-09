package demomain;

public class Ex01TestMainMethod {
	/*
	 Để thực thi 1 chương trình trong java
	 + Tạo ra 1 class --> tạo ra 1 file.java
	   có tên trùng với tên class
	 + Chương trình
	  .Cấu trúc dữ liệu: Khai báo bà lưu trữ dữ liệu
	  .Hàm/Phương thức: nới xử lý một chức năng trong chương trình
	  
	  .Hàm main: Là nơi bắt đầu và kết thúc 1 chương trình khi thực thi
	  
	  + Cú pháp tạo ra 1 hàm
	  	.Access modifier: public, private, protected, mặc định: phạm vi truy cập
	  	.Static: thuộc phạm vi 1 class => Lấy class chứa nó để gọi hàm static
	  	.return type: Kiểu dữ liệu trả ra
	  		+ void: Ko có trả về gì cả
	  		+ !void: trả ra(về) để sử dụng lại kq trả ra(về) đó làm việc khác,gì đó,.. 
	  	.method_name: tên hàm
	  		+ Đại diện cho chức năng của hàm
	  	.parameters: danh sách tham số
	  		+ Đầu vào của hàm
	  	.{...}: body ==> nội dung xử lý của hàm
	  	
	   	[access modifier] [static] return_type method_name(parameters) {
	   		// body: implementation
	   	}
	   	
	 */
	public static void main(String[] args) {
		System.out.println("Hàm main 01");
		System.out.println("Wellcome to java21 class");
		printStarTriangle();
		System.out.println("\n");
		printStarTriangle();
		
		System.out.println("\n..... Main Finshed .....");
	}
	public static void printStarTriangle() {
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
		System.out.println("* * * * *");
	}
//	private static void main(int[] args) {
//		System.out.println("Hàm main 02");
//	}
}
