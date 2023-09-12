package demomain;

public class Ex01TestMainMethod {
	// chú thích 1 dòng
	
	/*
	 chú thích nhiều dòng
	 	
	 	+ Để thực thi 1 ctr trong java tạo ra 1 file .java
	 	  có tên trùng với class
	 	  
	 	+ Chương trình
	 		Cấu trúc dữ liệu: khai báo và lưu trữ dữ liệu
	 		Hàm/ phương thức: nơi xử lý 1 chức năng trong ctr
	 		
	 	+ Hàm main: nơi bắt đầu và kết thúc 1 ctr khi thực thi
	 	
	 	+ Run: Ctrl + f11
	 	
	 	+ System.out.println
	 		--> in xong xuống dòng
	 	+ System.out.print
	 		--> in xong giữ nguyên
	 	+ Ctrl + d: xóa nhanh 1 dòng
	 	+ Ctrl + shift + f: định dạng code về chuẩn java mặc định
	 	
	 	+ Cú pháp tạo ra 1 hàm
	 	 
	 	 	+access modifier: public, private, proteced, mặc định: phạm vi truy cập
	 	 							+public: có thể sử dụng mọi nơi
	 	 							+private: 
	 	 	
	 	 	+static: thuộc phạm vi của class
	 	 			lấy class gọi hàm static
	 	 			giải thích kỹ hơn trong phần OOP
	 	 	+return_type: kiểu dữ liệu trả về có 2 kiểu
	 	 					+ void: kh trả về gì cả
	 	 					+ !void: trả về để sử dụng lại kq trả về đó làm việc khác
	 	 	+method_name: tên hàm
	 	 					+đại diện cho chức năng của hàm
	 	 	+parameters: danh sách tham số
	 	 	
	 	 	+{...}: body
	 	 		
	 	 			
	 		[access modifier] [static] return type method_name(parameters) {
	 		// body: implemntation
	 		}
	 */
	
	
	/**
	 * chú thích nhiều dòng --> giải thích định nghĩa 1 method, class
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		System.out.println("Hàm main 01");
		System.out.println("Welcomr to Java21 Class");
		System.out.println();
		
		
		Ex01TestMainMethod.printStarTriangle();
		System.out.println("...Finished...");
	}
	
	// Tạo ra 1 chức năng (hàm/phương thức) để in ra 1 tam giác ngôi sao 5 dòng
	public static void printStarTriangle () {
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * * *");
		System.out.println("* * * * * *");	
	}
	
}
