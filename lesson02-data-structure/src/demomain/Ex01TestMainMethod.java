package demomain;

public class Ex01TestMainMethod {
	/*
	 
	 Chương trình:
	 	. Cấu trúc dữ liệu: khai báo và lưu trữ dữ liệu
	 	. Hàm: nơi xử lý 1 chức năng trong chương trình.
	 	
	 	. Hàm main: nới bắt đầu và kết thúc 1 chương trình khi thực thi,
	 	
	 	Cú pháp tạo 1 hàm:
	 	
	 	access modifier: public, private, protected, mặc định: phạm vi truy cập
	 		+ public: có thể sử dụng mọi nơi
	 		+ private: chỉ dùng trong class
	 	static: thuộc phạm vi của class
	 			lấy class (chứa nó) gọi hàm static
	 	return_type: kiểu dữ liệu trả về:
	 		+ void
	 		+ !void
	 	method_name: tên hàm
	 				 đại diện cho chức năng hàm
	 	parameters: danh sách tham số
	 	{...}: body
	 		+ nội dung của hàm
	 	
	 	[access modifier] [static] return_type method_name(parameters) {
	 		//body: implementation
	 	}
	 	
	 */
	public static void main(String[] args) {
		System.out.println("Hàm main 1");
		System.out.println("Trần Hữu Tài");
		printStarTriangle();
	}
	
	public static void printStarTriangle() {
		System.out.println("Tài ");
		System.out.println("Tài Tài ");
		System.out.println("Tài Tài Tài ");
		System.out.println("Tài Tài Tài Tài ");
		
	}
}
