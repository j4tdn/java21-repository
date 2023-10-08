package view.functional.iinterface;

public class TestFunctionalInterface {

	public static void main(String[] args) {
		// Tạo 1 đối tượng cho interface IntComparator
		
		
		// Cách 1 : External class
		// Tốn thêm class
		
		// Cách 2: Anonymous class
		// Dài code chỗ tạo đối tượng
		IntComparator ic1 = new IntComparator() {
			
			@Override
			public int compare(int a, int b) {
				return a - b;
				
			}
		};
		System.out.println("Test anony mous class --> " + ic1.compare(5, 7));
		// Để tạo 1 đối tượng(Thể hiện) cho interface
		// --> Sử dụng external class, anonymous class
		// --> Sử dụng anonymous function để tạo 1 đối tượng cho fuctional interface(interface chỉ có 1 hàm)
		
		// Cách 3: Anonymous function(lambda expression) (Từ java 8 trở đi)
		// Không bắt buộc khai báo KDL cho các tham số
		// Nếu chỉ có 1 tham số --> có thể bỏ luôn ()
		// Nếu phần body chỉ có 1 dòng --> có thể xóa luôn phần {}
		// body return void : code như bình thường
		// body return !void : xóa chữ return
		IntComparator ic2 = (a, b)->a * b;		
		System.out.println("Test anonymous function --> "+ic2.compare(5, 7));
		
		// strategy pattern
	}
	
}
