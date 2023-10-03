package view.functional.iinterface;

public class TestFunctionalInterface {
	public static void main(String[] args) {
		//Tạo 1 đối tượng cho interface IntComparator
		
		//Để tạo 1 đối tượng thể hiện cho functional interface
		//-> sử dụng
		
		//c1: external class
		//tốn thêm 1 class
		
		//c2:anonymous class
		
		IntComparator ic1 = new IntComparator() {
			
			@Override
			public int compare(int a, int b) {
				return  a -b;
			}
		};
		System.out.println(ic1.compare(5, 7));
		
		//cách 3: anonymous function (từ java 8 trở đi)
		// anonymous func: là đoạn code dùng để override hàm trừu tượng từ interface
		// nếu có 1 tham số --> có thể bỏ luôn ()
		// nếu body chỉ có 1 dòng --> có thể cóa luôn phần {}
		//	body return void: code như bth
		//	body return != void: xóa chữ return
		
		IntComparator ic2 = (int a, int b) -> {
			return a - b;
		};
		
		IntComparator ic3 = (a, b) -> a * b;
		System.out.println(ic3.compare(5, 7));
		
		// Straegy pattern
		
		
	}
}
