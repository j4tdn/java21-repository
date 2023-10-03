package view.functional.iinterface;

public class TestFunctionalInterface {
	public static void main(String[] args) {
		// Tạo đối tượng cho interface IntComperator
		
		// Để tạo 1 đối tượng(thể hiện) cho interface
		// --> Sử dụng external class, anonymous class
		
		// Cách 1: External Class
		// Tốn thêm class
		
		// Cách 2: Anonymous class
		// Dài code chỗ tạo đối tượng
		IntComparator ic1 = new IntComparator() {
			
			@Override
			public int compare(int a, int b) {
				return a - b;
			}
		};
		System.out.println("Test anonymous class --> " + ic1.compare(5, 7));
		
		// --> Sử dụng anonymous function(lambda expression) để tạo đối tượng cho 1 functional interface(interface có duy nhất 1 hàm trừu tượng)
		// Anonymous function: là đoạn code dùng để override hàm trừu tượng interface
		
		// Cách 3: Anonymous function (từ java 8 trở đi)
		// Anonymous function: là đoạn code dùng để override hàm trừu tượng từ interface
		 IntComparator ic2 = (int a, int b) -> {
			 return a + b;
		 };
		 System.out.println("Test anonymous function --> " + ic2.compare(5, 7));
		 
		 // ko bắt buộc khai báo KDL cho các tham số
		 // Nếu chỉ cs 1 tham số --> có thể xóa luôn phần {}
		 // 	body return void	: code như bình thường
		 //		body return !void	: xóa chữ return
		 IntComparator ic3 = (a, b) -> a * b;
		 System.out.println("Test anonymous function --> " + ic3.compare(5, 7));
	}
}
