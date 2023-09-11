package demomain;

public class Ex01TestMainMethod {
	/* 15/08/2023
	 Để thực thi 1 trường trình trong JAVA
	 	+Tạo ra 1 class --> tạo ra 1 file .java
	 	có tên trùng tên với class
	 	+Chương trình
	 		. Cấu trúc dữ liệu: Khai báo và lưu trữ dữ liệu
	 		. Hàm/phương thức: nơi xử lý một chức năng trong chương trình
	 		. Hàm main: nơi bất đầu và kết thúc 1 chương trình khi thực thi
	 		System.out.println
	 			--> In nội dung ra xong xuống hàng
	 		System.out.print
	 			--> In nội dung ra xong giữ nguyên
	 			Ctrl  f11 --> Thực thi
	 			ctry d     --> xóa nhanh 1 dòng
	 		.Ctrl + shift F formart lại code đưa về chuẩn của Java mặc định
	 		. Cú pháp tạo ra 1 hàm
	 			.access modifier: public, private, protected, mặc định: phạm vi truy cập
	 					+public: có thể sử dụng mọi nơi
	 					+private: Dùng trong class chứa hàm này
	 			.static         : thuộc phạm vi của class
	 					lấy class (Chứa nó) gọi hàm static, giải thích kỹ hơn trong phần OOP
	 			.return_type    : Kiểu trả về
	 					+void: Không có trả về gì cả
	 					+!void: Trả về để sử dụng lại kết quả trả về đó làm việc khác
	 			.method_name: Tên hàm
	 					+Đại diện cho chức năng của hàm		
	 			.parameters: Danh sách tham số
	 					+ Đầu vào của hàm
	 			.{...} :body
	 					+Nội dung hàm
	 			[access modifier] [static] [return_type] method_name(parameters)
	 			//body :implementation
	 */ 
//  nhanh main + khoảng trắng - Enter

	public static void main(String[] args) {
		System.out.println("Hàm main 01");
		System.out.println("Welcome To JAVA21 class");
		System.out.println();
		
	//Gọi hàm printStarTriangle [tên class].[Tên hàm]
		Ex01TestMainMethod.printStarTriangle();
		//hoặc
		printStarTriangle(); // đã trong class rồi thì k cần gọi kiểu trên
 		System.out.println("...Main Finished...");
	}
	//Tạo ra 1 khai báo chức năng (hàm/ chức năng) để in ra tam giác ngôi sao có 5 dòng
	public static void printStarTriangle () {
		System.out.println ("*");
		System.out.println ("**");
		System.out.println ("****");
		System.out.println ("*****");
		System.out.println ("******");
	}
}
