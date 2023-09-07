package demomain;

public class Ex01TestMainMethod {

	/*
	 * để thực thi 1 chương trình trong java +tạo ra 1 class --> tạo ra 1 file.java
	 * có tên trùng với tên class
	 * 
	 * + chương trình gồm 2 phần . cấu trúc dữ liệu: khai báo và lưu trữ dữ liệu .
	 * hàm/ phương thức: nơi xử lý 1 chức năng trong chương trình
	 * 
	 * .hàm main: là nơi bắt đầu và kết thúc 1 chương trình khi thực thi
	 * 
	 * System.out.println: --> in xong xuống hàng System.out.print : --> in xong giữ
	 * nguyên
	 * 
	 * ctrl shift f --> format(định dạng code về chuẩn của java mặc định)
	 * 
	 * 
	 * cú pháp khi tạo ra 1 hàm 
	 * access modifier: public, private, protected, mặc định: phạm vi truy cập 
	 * 			+ public : có thể sử dụng mọi nơi
	 * 			+private: chỉ sử dung trong hàm
	 * 
	 * static : thuộc phạm vi của class
	 * 			lấy class(chứa nó) gọi hàm static
	 * return type: kiểu dữ liệu trả về 
	 * 			+ void  : ko trả về j 
	 * 			+ !void : trả về để sử dụng lại kết quả trả về đó
	 * method_name : tên hàm
	 * 		+ đại diện cho chức năng của hàm
	 * parameters: danh sách tham số
	 * 		+ đầu vào của hàm
	 * {...}: body
	 * 		+ nội dung hàm
	 * 
	 * [access modifier] [static] return_type method_name(parameters){
	 * 			//body : implementation
	 * }
	 */
	public static void main(String[] args) {
		System.out.println("Hàm main 01");
		System.out.println("Welcom to java21 class");
		
		System.out.println("");
		
		// gọi hàm 
		printStarTriangle();
		printStarTriangle();
		
		System.out.println("...Main Finished...");
		
	}
	
	// tạo ra 1 chức năng (hàm/ phương thức) để in ra tam giác ngôi sao có 5 dòng
	public static void printStarTriangle() {
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
	}

}
