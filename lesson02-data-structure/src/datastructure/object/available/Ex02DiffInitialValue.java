package datastructure.object.available;

public class Ex02DiffInitialValue {
	public static void main(String[] args) {
		// Integer Demo
		// Khởi tạo với từ khóa new --> giá trị lưu trữ ở vùng nhớ Heap
		// 
		Integer io1 = new Integer(24);
		Integer io2 = new Integer(36);
		Integer io3 = new Integer(24);
		Integer io4 = new Integer(18);
		
		System.out.println("io1: " + io1 + "(Address: " + System.identityHashCode(io1) + ")");
		System.out.println("io2: " + io2 + "(Address: " + System.identityHashCode(io2) + ")");
		System.out.println("io3: " + io3 + "(Address: " + System.identityHashCode(io3) + ")");
		System.out.println("io4: " + io4 + "(Address: " + System.identityHashCode(io4) + ")");
		
		System.out.println("\n=========================\n");
		
		Integer i5 = 17;
		Integer i6 = 29;
		Integer i7 = 17;
		Integer i8 = 17;
		
		System.out.println("i5: " + i5 + "(Address: " + System.identityHashCode(i5) + ")");
		System.out.println("i6: " + i6 + "(Address: " + System.identityHashCode(i6) + ")");
		System.out.println("i7: " + i7 + "(Address: " + System.identityHashCode(i7) + ")");
		System.out.println("i8: " + i8 + "(Address: " + System.identityHashCode(i8) + ")");
		System.out.println("\n=============After============\n");
		i8 = 90;
		System.out.println("i5: " + i5 + "(Address: " + System.identityHashCode(i5) + ")");
		System.out.println("i6: " + i6 + "(Address: " + System.identityHashCode(i6) + ")");
		System.out.println("i7: " + i7 + "(Address: " + System.identityHashCode(i7) + ")");
		System.out.println("i8: " + i8 + "(Address: " + System.identityHashCode(i8) + ")");
	}
}
