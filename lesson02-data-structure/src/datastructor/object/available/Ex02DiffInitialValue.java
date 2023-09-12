package datastructor.object.available;

public class Ex02DiffInitialValue {
	public static void main(String[] args) {
		
		// Integer Demo
		//Khởi tạo với từ khóa new --> giá trị sẽ lưu trữ ở vùng nhớ heap
		//Khi khởi tạo ô nhớ mới, luôn luôn tạo ra ô nhớ mới khi khởi tạo giá trị
		
		//Khi khai báo số nguyên:
			//Giá trị bắt buộc int
			//Giá trị có thể có hoặc không Integer  
		
		Integer io1 = new Integer(24);
		Integer io2 = new Integer(36);
		Integer io3 = new Integer(24);
		Integer io4 = new Integer(18);
		
		System.out.println("Value("+ io1 + ") --> address(" + System.identityHashCode(io1) + ")");
		System.out.println("Value("+ io2 + ") --> address(" + System.identityHashCode(io2) + ")");
		System.out.println("Value("+ io3 + ") --> address(" + System.identityHashCode(io3) + ")");
		System.out.println("Value("+ io4 + ") --> address(" + System.identityHashCode(io4) + ")");
		
		//Khởi tạo trực tiếp k dùng từ khóa new --> giá trị sẽ lưu trữ ở vùng nhớ heap/constant pool
		//Kiểm tra xem giá trị chuẩn bị khởi tạo đã tồn tại trên 'constant pool' chưa
		// +Nếu chưa tồn tại thì tạo ô nhớ mới và gán đại chỉ về cho biến(stack)
		// +Nếu đã tồn tại thì lấy địa chỉ của ô nhớ đã tồn tại gán về cho biến(stack)
		
		Integer i5 = 17;
		Integer i6 = 28;
		Integer i7 = 11;
		Integer i8 = 17;
		i6 = 17;
		
		System.out.println("Value("+ i5 + ") --> address(" + System.identityHashCode(i5) + ")");
		System.out.println("Value("+ i6 + ") --> address(" + System.identityHashCode(i6) + ")");
		System.out.println("Value("+ i7 + ") --> address(" + System.identityHashCode(i7) + ")");
		System.out.println("Value("+ i8 + ") --> address(" + System.identityHashCode(i8) + ")");
		
		
	}
}
