package datastructure.object.available;

public class Ex02DiffInitiaValue {
	public static void main(String[] args) {
		// Integer Demo
		// Khởi tạo với từ khóa new --> giá trị sẽ lưu trữ ở vùng nhớ heap
		// Luôn tạo ra ô nhớ mới khi khởi tạo giá trị
		Integer io1 = new Integer(24);
		Integer io2 = new Integer(36);
		Integer io3 = new Integer(24);
		Integer io4 = new Integer(18);
		
		System.out.println("io1("+ io1 +") --> address(" + System.identityHashCode(io1) +")");
		System.out.println("io2("+ io2 +") --> address(" + System.identityHashCode(io2) +")");
		System.out.println("io3("+ io3 +") --> address(" + System.identityHashCode(io3) +")");
		System.out.println("io4("+ io4 +") --> address(" + System.identityHashCode(io4) +")");
		
		System.out.println("\n==============\n");

		// Khởi tạo trực tiếp không dùng từ khóa new --> giá trị sẽ lưu trữ ở vùng nhớ HEAP/constant pool
		// Kiểm tra xem giá trị chbi khởi tạo đã tồn tại trên constant pool chưa
		//	+ Nếu chưa tồn tại thì tạo ô nhớ mới và gán địa chỉ về cho biến(stack)
		//	+ Nếu đã tồn tại thì lấy địa chỉ của ô nhớ đã tồn tại gán về cho biến (stack) 
		Integer i5 = 17;
		Integer i6 = 28;
		Integer i7 = 11;
		Integer i8 = 17;
		i6 = 17;
		System.out.println("i5("+ i5 +") --> address(" + System.identityHashCode(i5) +")");
		System.out.println("i6("+ i6 +") --> address(" + System.identityHashCode(i6) +")");
		System.out.println("i7("+ i7 +") --> address(" + System.identityHashCode(i7) +")");
		System.out.println("i8("+ i8 +") --> address(" + System.identityHashCode(i8) +")");

		
		// String Demo
	}
}
