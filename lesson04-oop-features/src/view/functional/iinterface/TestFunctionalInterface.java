package view.functional.iinterface;

public class TestFunctionalInterface {

	public static void main(String[] args) {
		// Tạo 1 đối tượng cho interface IntComparator
		
		// Cách 1: External class
		// tốn thêm class
		
		// Cách 2: Anonymous class
		// dài code
		IntComparator ic1 = new IntComparator() {
			
			@Override
			public int compare(int a, int b) {
				return a - b;
			}
		};
		System.out.println("Test anonymous class -->  " + ic1.compare(5, 7));
		
		// Cách 3: Anonymous function (từ java 8 trở đi)
		IntComparator ic2 = (int a, int b) -> {
			return a + b;
		};
		System.out.println("Test anonymous function --> " + ic2.compare(5, 7));
		
		// Không bắt buộc khai báo KDL cho các tham số 
		// Nếu chỉ có 1 tham số --> có thể bỏ luôn '()'
		// Nếu phần body chỉ có 1 dòng --> có thể xóa luôn phần '{}'
		// body return void : code như bình thường 
		// body return !void: xóa chữ return
		IntComparator ic3 = (a, b) -> a * b;
		System.out.println("Test anonymous function --> " + ic3.compare(5, 7));
	}
}
