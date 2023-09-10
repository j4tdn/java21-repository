package datastructure.object.available;

public class Ex02DiffInitialValue {
	public static void main(String[] args) {
		// Integer Demo 
		// Khởi tạo với từ khóa new --> giá trị sẽ lưu trữ ở vùng nhớ heap
		// Luôn tạo ra ô nhớ mới khi khởi tạo giá trị 
		Integer io1 = new Integer(24);
		Integer io2 = new Integer(36);
		Integer io3 = new Integer(24);
		Integer io4 = new Integer(18);
		
		System.out.println("value("+ io1 + ") --> address(" + System.identityHashCode(io1) + ")");
		System.out.println("value("+ io2 + ") --> address(" + System.identityHashCode(io1) + ")");
		System.out.println("value("+ io3 + ") --> address(" + System.identityHashCode(io1) + ")");
		System.out.println("value("+ io4 + ") --> address(" + System.identityHashCode(io1) + ")");
		
		System.out.println("\n====================================\n");
		
		// Khởi tạo trực tiếp không dùng từ khóa new --> giá trị sẽ lưu trữ ở vùng nhớ heap/constant pool 
		// Kiểm tra xem giá trị chuẩn bị khởi tạo đã tồn tại tên constant pool chưa
		// + Nếu chưa tồn tại thì tạo ô nhớ mới và gán địa chỉ về cho biến(stack)
		// + Nếu đã tồn tại thì lấy địa chỉ của ô nhớ đã tồn tại gán về cho biến (stack)
		
		Integer i5 = 17;
		Integer i6 = 28;
	    Integer i7 = 11;
	    Integer i8 = 17;
	    
	    System.out.println("value("+ i5 + ") --> address(" + System.identityHashCode(i5) + ")");
	    System.out.println("value("+ i6 + ") --> address(" + System.identityHashCode(i6) + ")");
	    System.out.println("value("+ i7 + ") --> address(" + System.identityHashCode(i7) + ")");
	    System.out.println("value("+ i8 + ") --> address(" + System.identityHashCode(i8) + ")");
	    
	    
		//String Demo
		
		String so1 = new String("hello");
		String so2 = new String("hello");
		System.out.println("so1("+ so1 + ") --> address(" + System.identityHashCode(so1) + ")");
		System.out.println("so2("+ so2 + ") --> address(" + System.identityHashCode(so2) + ")");
	}
}
