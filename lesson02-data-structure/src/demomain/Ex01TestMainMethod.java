package demomain;

public class Ex01TestMainMethod {
	/*
	 
	 Để thực thi 1 chương trình trong JAVA
	 + Tạo ra 1 class --> tạo ra 1 file.java
	   có tên trùng với class
	   
	 + Chương trình gồm 2 phần:
	   . Cấu trúc dữ liệu: Khai báo và lưu trữ dữ liệu
	   . Hàm/ phương thức: Nơi xử lí 1 chức năng trong chương trình
	   
	   . Hàm main: nơi bắt đầu và kết thúc 1 chương trình khi thực hiện
	 	 
	   
	 + Thực thi
	   Ctrl F11 --> thực thi class hiện tại
	   Ctrl d --> xóa nhanh 1 dòng
	   Ctrl Shift f --> format(định dạng code về chuẩn của Java mặc định)
	   
	   Cú pháp khi tạo ra 1 hàm
	   
	   access modifier: public, private, protected, mặc định: phạm vi truy cập
	   		  + public: có thể sử dụng mọi nơi	
	   		  + private: 	
	   		  
	   static: thuộc phạm vi của class
	   		   lấy class(chứa nó) gọi hàm static
	   		   
	   return_type: kiểu dữ liệu trả về
	   		  + void: ko trả về gì cả
	   		  + !void: trả về để sử dụng lại kết quả trả về đó làm việc khác
	   		  
	   method_name: tên hàm		  
	   
	   parameters: danh sách tham số
	   		  + đầu vào của hàm
	   		  
	   {...}: body
	   		+ nội dung hàm  
	   		  
	   [access modifier] [static] return_type method_name(parameters){
	   			//body
	   }
	   
	 */
	public static void main(String[] args) {
		System.out.println("Hàm main 01");
		System.out.println("Welcome to JAVA21 class");
		
		// Gọi hàm printStarTriangle
		printStarTriangle();
		
		System.out.println("\n...Main finished...");
	}
	
	
	
	// Tạo ra 1 chức năng(hàm/phương thức) để in ra tam giác ngôi sao có 5 dòng
	public static void printStarTriangle() {
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
		System.out.println("* * * * *");
	}
	
}
