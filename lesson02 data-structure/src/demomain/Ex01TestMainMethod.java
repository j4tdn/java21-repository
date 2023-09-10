package demomain;

public class Ex01TestMainMethod {
	
	/*
	 Để thực thi 1 chương trình trong JAVA
	 + Tạo ra 1 class --> tạo ra 1 file.java
	 có tên trùng với tên class
	 
	 + Chương trình 
	 	. Cấu trúc dữ liệu: khai báo và lưu trữ dữ liệu
	 	. Hàm/phương thức: nơi xử lí một chức năng trong chương trình
	 Hàm main: nơi bắt đầu và kết thúc 1 chương trình khi thực thi
	 + Thực thi: 
	   nhấn Ctrl F11 --> thực thi class hiện tại
	   System.out.println
	 	--> In nội dung ra xong xuống hàng
	   System.out.print
	   	--> In nội dung ra xong giữ nguyên
	   	\n --> xuống hàng
	   Ctrl D --> xóa 1 dòng
	   Ctrl Shift F --> formart(định dạng code về chuẩn của Java mặc định)
	   Cú pháp để tạo ra 1 hàm
	   
	   access modifier: public, private, protected, mặc định: phạm vi truy cập
	   	+ public: sử dụng mọi nơi
	   	+ private: dùng trong class chứa hàm này
	   	
	   static: thuộc phạm vi của class
	   		   lấy class(chứa nó) gọi hàm static
	   		   giải thích kĩ hơn trong phần OOP
	   return_type: kiểu dữ liệu trả về
	   có 2 loại:
	   	+ void: không trả về gì cả
	   	+ !void: trả về để sử dụng lại kết quả trả về đó làm việc khác
	   method_name: tên hàm
	   	+ đại diện cho chức năng của hàm
	   parameters: danh sách tham số
	   	+ đầu vào của hàm
	   {...}: body
	   		+ nội dung của hàm
	   [access modifier] [static] return type method name(parameters)
	   public class A {
	   		//body: implemention
	   	}
	 */
	public static void main(String[] args) {
		System.out.println("Hàm main 01");
		System.out.println("Welcome to Java21 class");
		
		System.out.println();
		
		// Gọi hàm printStarTriangle
		printStarTriangle();
		
		System.out.println(".... Main Finished ....");
		
	}
	// Tạo ra 1 chức năng (hàm/phương thức) để in ra tam giác ngôi sao có 5 dòng
	public static void printStarTriangle(){
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
		System.out.println("* * * * *");
	}
	
}
