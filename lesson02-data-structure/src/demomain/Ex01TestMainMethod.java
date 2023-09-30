package demomain;

public class Ex01TestMainMethod {
	/*
	Để thực thi 1 chương trình trong JAVA
	+ Tạo ra 1 class --> tạo ra 1 file .java
	  có tên trùng với tên class
	  
	  
	+ Chương trình gồm 2 phần
	  . Cấu trúc dữ liệu: Khai báo và lưu trữ dữ liệu
	  . Hàm/phương thức: nơi xử lý một chức năng trong chương trình 
	  . Hàm main: nơi bắt đầu và kết thúc 1 chương trình khi thực thi 
	
	
	+ Thực thi: 
	ctrl + fn + f11: chạy
	Ctrl + shift + f: format
	Ctrl + d : xóa 1 dòng  
	
	
	+ Cú pháp khi tạo ra 1 hàm
	
	access modifier: public, private, protected, mặc định: Phạm vi truy cập
	               + public: có thể sử dụng mọi nơi
	               + private: dùng trong class chứa hàm này 
	static: thuộc phạm vi của class
	        lấy class(chứa nó) gọi hàm static
	        giải thích kĩ hơn trong phần OOP
	        
	return_type: kiểu dữ liệu trả về
	      + void: không có trả về gì cả
	      + !void: trả về để sử dụng lại kết quả trả về đó làm việc khác 
	      
	method_name: Tên hàm
	      + đại diện cho chức năng của hàm 
	parameters: danh sách tham số
	          + đầu vào của hàm 
	{...} : body
	      + nội dung hàm 
	             
	[access modifier] [static] return_type method_name(parameters) {
	
	           // body: implementation
	         
	}
	
	
	 */
	
	
	
	public static void main(String[] args) {
		System.out.println("Hàm main 01");
		System.out.println("Welcome to JAVA ");
		
		System.out.println();
		
		//gọi hàm
		printStarTriangle();
		
			
	}
	
	
	public static void printStarTriangle() {
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
		System.out.println("* * * * *");
	}
}


	