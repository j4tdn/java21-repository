package view.functional.innterface;

public class TestFunctionalInterface {
	public static void main(String[] args) {
		// Tạo 1 đối tượng cho interface IntComparator
		// Để tạo 1 đối tượng(thể hiện) cho interface:

		// C1: external class ---> tốn thêm class
		// --> sử dụng external class để tạo đối tượng cho 1 interface bất kì

		// C2: anonymous class--> dài code chỗ tạo đối tượng
		// --> sử dụng cho 1 functional interface(interface có duy nhất 2 hàm trừu
		// tượng)
		IntComparator ic1 = new IntComparator() {

			@Override
			public int compare(int a, int b) {
				return a - b;
			}
		};
		System.out.println("Test anonymous class --->" + ic1.compare(5, 7));

		// C3: Từ java 8 có khái niệm có: Anonymous function
		// Anonymous function: là đoạn code dùng để override hàm trừu tượng từ
		
		/*
		 Không bắt buộc khai báo KDL cho các tham số
		 Nếu chỉ có 1 tham số---> có thể bỏ luôn ()
		 Nếu phần body chỉ có 1 dòng--> có thể xóa luôn{}
		 body return void: code như bình thường
		 bode return !void: xóa chữ return
		 */
		IntComparator ic2 = (int a, int b) -> {
			return a + b;

		};
		System.out.println("Test anonymous class --->" + ic2.compare(5, 7));
		
		//stategy pattern
	}
}
