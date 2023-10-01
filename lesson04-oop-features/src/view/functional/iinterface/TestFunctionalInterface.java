package view.functional.iinterface;

public class TestFunctionalInterface {
	public static void main(String[] args) {
		// Tạo 1đối tượng (thể hiện) cho Interface IntComparator
		// Để tạo 1 đối tượng (
		
		//Cách 1: Dùng External Class
		// Tốn thêm class
		
		//Cách 2: Annonymous class
		// Dài code chổ tạo đối tượng
		IntComparator ic1 = new IntComparator() {
			
			@Override
			public int compare(int a, int b) {
				
				return a-b;
			}
		};
		System.out.println("Test annonymous class -->" +ic1.compare(5, 7));
		//--> sử dụng Anonymous function để tạo đối tượng
		// cho 1 functional interface
		//Cách 3: Annonymous function từ (Từ Java 8 trở đi)
		// Anonymous function: Là đoạn code dùng để override hàm trừu tượng từ 
		IntComparator ic2 = (int a, int b) -> {
			return a+b;
		};
		System.out.println("Test annonymous class -->" +ic1.compare(5, 7));
		
		//Không bắt buộc khai báo KDL cho các tham số
		//Nếu chỉ có 1 tham số --> có thể bỏ luôn ()
		//Nếu phần body chỉ có 1 dòng --> có thể xóa luôn phần {}
		// body return void: code như bình thương
		// body return !void: xóa chữ return
		
		IntComparator ic3 = (a, b) -> a * b; // dùng lambda
		System.out.println("Test annonymous class -->" + ic3.compare(5, 7));
	}
}
