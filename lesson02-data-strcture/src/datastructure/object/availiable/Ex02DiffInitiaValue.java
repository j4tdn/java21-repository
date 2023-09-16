package datastructure.object.availiable;

public class Ex02DiffInitiaValue {
	public static void main(String[] args) {
		// Khởi tạo với từ khóa new --> giá trị sẽ đc lưa ở vùng nhớ Heap
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		Integer i3 = new Integer(1);
		Integer i4 = new Integer(100);

		System.out.println("Value(" + i1 + ") --> address(" + System.identityHashCode(i1) + ")");
		System.out.println("Value(" + i2 + ") --> address(" + System.identityHashCode(i2) + ")");
		System.out.println("Value(" + i3 + ") --> address(" + System.identityHashCode(i3) + ")");
		System.out.println("Value(" + i4 + ") --> address(" + System.identityHashCode(i4) + ")");

		System.out.println("\n-------------------");

		// Khởi tạo trực tiếp không sử dụng từ khóa new --> giá trị sẽ đc lưa ở vùng nhớ
		// Heap/constant pool
		// Kiểm tra xem giá trị chuẩn bị khởi tạo đã tồn tại trên constant pool chưa
		// + Nếu chưa tồn tại thì tạo ô nhớ mới và gán giá trị vào nó
		// + Nếu đã tồn tại

		Integer i5 = 1;
		Integer i6 = 6;
		Integer i7 = 1;
		Integer i8 = 8;
		System.out.println("Value(" + i5 + ") --> address(" + System.identityHashCode(i5) + ")");
		System.out.println("Value(" + i6 + ") --> address(" + System.identityHashCode(i6) + ")");
		System.out.println("Value(" + i7 + ") --> address(" + System.identityHashCode(i7) + ")");
		System.out.println("Value(" + i8 + ") --> address(" + System.identityHashCode(i8) + ")");
	}
}
