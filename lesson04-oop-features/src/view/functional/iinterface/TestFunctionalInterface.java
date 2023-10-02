package view.functional.iinterface;

public class TestFunctionalInterface {

	public static void main(String[] args) {
		// tạo 1 đối tượng(thể hiện) cho interface interface
		
		// để tạo 1 đối tượng (thể hiện) cho interface
		// --> sử dụng external class, anonymous class
		
		// cách 1: External class
		// tốn thêm class
		
		// cách 2: anonymous class
		// Daif 
		
		IntComparator ic1 = new IntComparator() {
			@Override
			public int compare(int a, int b) {
				return a + b;
			}
		};
		System.out.println("test anonymous class --> " + ic1.compare(5, 7));
		
		// sử dụng anonymous function() để tạo đối tượng 
		// cho 1 functional interface(interface có duy nhất 1 hàm trừu tượng)
		
		// cách 3: anonymous function (từ java 8 trở đi)
		// anonymous function: là đoạn code dùng để override hàm trừu tượng từ intcomparator
		IntComparator ic2 = (int a, int b) -> {
			return a + b;
		};
		System.out.println("test anonymous class --> " + ic2.compare(5, 7));

		// ko bắt buộc khai báo KDL cho các tham số
		// nếu chỉ có 1 tham số --> có thể bỏ luôn ()
		// nếu phần body chỉ có 1 dòng --> có thể xoá luôn phần {}
		//	body return void : code như bình thường
		//	body return !void: xoá chữ return
		IntComparator ic3 = (a, b) -> a * b;
		System.out.println("Test anonymous function --> " + ic3.compare(5, 7));
	}
}
