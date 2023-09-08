package demomain;

public class Ex01TestMainMethod {

	/*
	 Để thực thi một chương trình trong JAVA 
	 
	 + Tạo ra 1 class --> tạo ra 1 file .java
						  có tên trùng với class
	 
	 + Chương trình
	 	. Cấu trúc dữ liệu: khai báo và lưu trữ dữ liệu
	 	. Hàm/phương thức: nơi xử lý một chức năng trong chương trình
	 	
	 	. Hàm main: nơi bắt đầu và kết thúc 1 chương trình khi thực thi
	 	
	 	System.out.println
	 		--> in nội dung ra xong xuống hàng
	 	System.out.print
	 		--> in nội dung ra xong giữ nguyên
	 	\n --> xuống hàng
	 	
	 +Thực thi
	 Ctrl F11 --> Thực thi class hiện tại
	 ctrl d --> xoá nhanh 1 dòng
	 ctr shift f --> forrmat(định dạng code về chuẩn của java mặc định)
	 
	 +Cú pháp khi tạo ra 1 hàm
	 
	 access modifier: public, private, protected, mặc định: phạm vi truy cập
	 	+ public: có thể dùng mọi nơi
	 	+ private: dùng trong class chứa hàm này
	 	
	 static: thuộc phạm vi của class
	 		 lấy class(chứa nó) gọi hàm static
	 		 giải thích kỹ hơn trong phần OOP
	 		 
	 return_type: kiểu dữ liệu trả về
	 	+ void: không trả về gì cả
	 	+ !void: trả về để sử dụng lại kq trả về đó làm việc khác
	 	
	 method_name: tên hàm
	 	+ đại diện cho chức năng của hàm
	 	
	 parameters: danh sách tham số
	 	+ đầu và của hàm
	 	
	 {...}: body
	 	+ Nội dung hàm
	 
	 [access modifier] [static] return_type method_name(parameters) {
	 	//body: implementation
	 }
	 
	 */
	  
	/*
	 	chú thích nhiều dòng	
	 */
	
	/**
	 	chú thích nhiều dòng --> giải thích cho định nghĩa 1 hàm,
	 	1 method, 1 class
	 */
	
 	public static void main(String[] args) {
		System.out.println("hàm main 01");
		System.out.println("xin chao");

		System.out.println();
		
		// in ra tam giác ngôi sao
		printStartTriangle();

		System.out.println("...Main Finished...");

	}
	
	//tạo ra 1 chức năng(hàm/phương thức) để in ra tam giác ngôi sao có 5 dòng
	public static void printStartTriangle() {
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");

	}
	
}
