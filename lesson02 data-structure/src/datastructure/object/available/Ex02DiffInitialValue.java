package datastructure.object.available;

public class Ex02DiffInitialValue {
	
	public static void main(String[] args) {
		
		// JAVA 1.0
		// Hàm --> new Integer(5)
		
		// JAVA 2.0
		// Hàm --> new Integer(5); Xóa --> Integer a = 5
		// Thay vì xóa --> đánh dấu hàm là deprecated --> lỗi thời nên được thay thế bằng hàm (cách khác)
		// LocalDate, LocalTime
		// Lambda Expression
		
		// TodoApp
		// Sử dụng Java 1.0
		// 1000 chỗ code dùng new Integer(5) --> 50 ngày
		
		// HelloApp
		// Sử dụng Java 1.0
		// 10000 chỗ code dùng new Integer(5)
		
		
		// Integer Demo
		// Khởi tạo với từ khóa "new" --> giá trị sẽ lưu trữ ở vùng nhớ HEAP
		// Luôn tạo ra ô nhớ mới mỗi khi khởi tạo giá trị
		
		// immutable: ô nhớ HEAP không thể cập nhật giá trị của thuộc tính
		// mutable: thì cập nhật bình thường
		
		Integer io1 = new Integer(24);
		Integer io2 = new Integer(36);
		Integer io3 = new Integer(24);
		Integer io4 = new Integer(18);
		
		System.out.println("io1("+ io1 + ") --> address(" + System.identityHashCode(io1) + ")");
		System.out.println("io2("+ io2 + ") --> address(" + System.identityHashCode(io2) + ")");
		System.out.println("io3("+ io3 + ") --> address(" + System.identityHashCode(io3) + ")");
		System.out.println("io4("+ io4 + ") --> address(" + System.identityHashCode(io4) + ")");
		
		System.out.println("\n==================\n");
		
		// Khởi tạo trực tiếp không dùng từ khóa "new" --> giá trị sẽ lưu ở vùng nhớ HEAP/constant pool
		// Kiểm tra xem giá trị chuẩn bị khởi tạo đã tồn tại trên constant pool chưa
		// + Nếu chưa tồn tại thì tạo ô nhớ mới và gán địa chỉ về cho biến (stack)
		// + Nếu đã tồn tại thì lấy địa chỉ của ô nhớ đã tồn tại gán về cho biến (stack)
		
		Integer i5 = 17;
		Integer i6 = 28;
		Integer i7 = 11;
		Integer i8 = 17;

		System.out.println("i5("+ i5 + ") --> address(" + System.identityHashCode(i5) + ")");
		System.out.println("i6("+ i6 + ") --> address(" + System.identityHashCode(i6) + ")");
		System.out.println("i7("+ i7 + ") --> address(" + System.identityHashCode(i7) + ")");
		System.out.println("i8("+ i8 + ") --> address(" + System.identityHashCode(i8) + ")");
		
		System.out.println("\n==================\n");
		
		// String Demo
		String so1 = new String("hello");
		String so2 = new String("hello");
		System.out.println("so1("+ so1 + ") --> address(" + System.identityHashCode(so1) + ")");
		System.out.println("so2("+ so2 + ") --> address(" + System.identityHashCode(so2) + ")");
		
		String s3 = "hila";
		String s4 = "hila";
		String s5 = "hila";
		String s6 = "hila"; // 100 biến stack đang trỏ cùng đến H2 mang giá trị hila
		
		System.out.println("\n==================\n"); 
		
		System.out.println("s3("+ s3 + ") --> address(" + System.identityHashCode(s3) + ")");
		System.out.println("s4("+ s4 + ") --> address(" + System.identityHashCode(s4) + ")");
		System.out.println("s5("+ s5 + ") --> address(" + System.identityHashCode(s5) + ")");
		System.out.println("s6("+ s6 + ") --> address(" + System.identityHashCode(s6) + ")");
		
		System.out.println("\n======== After s4 --> lalala==========\n");
		
		s4 = "lalala";
		
		System.out.println("s3("+ s3 + ") --> address(" + System.identityHashCode(s3) + ")");
		System.out.println("s4("+ s4 + ") --> address(" + System.identityHashCode(s4) + ")");
		System.out.println("s5("+ s5 + ") --> address(" + System.identityHashCode(s5) + ")");
		System.out.println("s6("+ s6 + ") --> address(" + System.identityHashCode(s6) + ")");
		
	}

}
