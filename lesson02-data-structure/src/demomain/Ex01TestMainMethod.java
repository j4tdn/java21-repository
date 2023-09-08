package demomain;

public class Ex01TestMainMethod {
	/*
	 * Để thực thi 1 chương trình trong java + Tạo 1 class --> tạo ra 1 file.java có
	 * tên trùng với class 
	 * 
	 * + Chương trình 
	 * 
	 * - Cấu trúc dữ liệu: khai báo và lưu trữ dữ liệu 
	 * - Hàm/ phương thức: nơi xử lý 1 chức năng trong 
	 * - Hàm main: nơi bắt đầu và kết thúc 1 chương trình khi thực thi
	 * - ctrl shift f: format code
	 * - Cú pháp tạo 1 hàm		
	 * 
	 * 	[access modifier] [static] return_type method_name(parameters){
	 * 		body implementation
	 * 	}
	 * 
	 * - access modifier: public, private, pro
	 * - static: thuộc phạm vi của class
	 * 			 lấy class(chứa nó) gọi hàm static
	 * - return_type: kiểu dữ liệu trả về
	 * - method_name: tên hàm, đại diện cho chức năng của hàm
	 * - parameters: danh sách tham số
	 * 				 đầu vào của hàm
	 */
	
	public static void main(String[] args) {
		System.out.println("Hàm main 01");
		printStarTriangle();		
	}
	
	public static void printStarTriangle() {
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("******");
	}
}
