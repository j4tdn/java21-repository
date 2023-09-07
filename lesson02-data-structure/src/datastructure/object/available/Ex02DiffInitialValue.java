package datastructure.object.available;

public class Ex02DiffInitialValue {
	public static void main(String[] args) {
		
		// Integer Demo
		//khởi tạo với từ khóa new --> giá trị sẽ lưu ở vùng nhớ heap
		//luôn tạo ra ô nhớ mới khi khởi tạo giá trị
		Integer io1 = new Integer(24);
		Integer io2 = new Integer(36);
		Integer io3 = new Integer(24);
		Integer io4 = new Integer(18);
		
		System.out.println("i01("+ io1 + ") --> address("+System.identityHashCode(io1)+")");
		System.out.println("io2("+ io2 + ") --> address("+System.identityHashCode(io2)+")");
		System.out.println("i03("+ io3 + ") --> address("+System.identityHashCode(io3)+")");
		System.out.println("i04("+ io4 + ") --> address("+System.identityHashCode(io4)+")");
		
		System.out.println("\n==============\n");
		
		//khởi tạo trực tiếp ko dùng từ khóa new --> giá trị sẽ lưu trữ ở vùng nhớ heap/constant pool
		//kiểm tra xem giá trị chuẩn bị khởi tạo đã tồn tại trên constant pool chưa 
		//+nếu chưa tồn tại thì tạo ô nhớ mới và gán địa chỉ về cho biến (stack)
		//+nếu đã tồn tại thì lấy địa chỉ của ô nhớ đã tồn tại gán về cho biến (stack)
		Integer i5 = 17;
		Integer i6 = 28;
		Integer i7 = 11;
		Integer i8 = 17;
		
		System.out.println("i5("+ i5 + ") --> address("+System.identityHashCode(i5)+")");
		System.out.println("i6("+ i6 + ") --> address("+System.identityHashCode(i6)+")");
		System.out.println("i7("+ i7 + ") --> address("+System.identityHashCode(i7)+")");
		System.out.println("i8("+ i8 + ") --> address("+System.identityHashCode(i8)+")");
		
		//String Demo
		String so1 = new String("hello");
		String so2 = new String("hello");
		System.out.println("so1("+ so1 + ") --> address("+System.identityHashCode(so1)+")");
		System.out.println("so2("+ so2 + ") --> address("+System.identityHashCode(so2)+")");
		
		String s3 = "hila";
		String s4 = "hila";
		String s5 = "hila";
		String s6 = "hila"; 

		System.out.println("s3("+ s3 + ") --> address("+System.identityHashCode(s3)+")");
		System.out.println("s4("+ s4 + ") --> address("+System.identityHashCode(s4)+")");
		System.out.println("s5("+ s5 + ") --> address("+System.identityHashCode(s5)+")");
		System.out.println("s6("+ s6 + ") --> address("+System.identityHashCode(s6)+")");
	}

}
