package a.validation_try_catch_throw_throws;

public class Ex03Exception_Throw {

	// validattion: validate trước đoạn code có khả năng bị exception
	// try catch: đưa đoạn code có khả năng bị exception vào khối try

	// throw_throws
	// throw: ném exception trước khi đoạn code có khả năng bị exception xảy ra
	//      : ném khi mà exception xảy ra hay ko phụ thuộc vào parameter truyền vào lúc
	//        gọi hàm

	public static void main(String[] args) {
		// Vị trí A: gọi ham divide
		//         : validate a, b nhập vào phải là số nguyên
		//         :             b phải khác 0
		System.out.println("Vị trí A: " + divide(4, 2));
		
		System.out.println("\n================================\n");
		// Vị trí B: gọi hàm divide
		//         : cho a, b tùy ý - chưa có validation
		try {
			System.out.println("Vị trí B: " + divide(4, 0));
		} catch (ArithmeticException e) {
			System.out.println("ef " + e.getMessage());
		}
		
		// ko bắt buộc phải xử lý(try_catch/throws đi chỗ khác)
		divide(4, 0);
	}

	private static int divide(int a, int b) {
		if (b == 0) {
			// fail first --> save time
			// custom exception, message
			throw new ArithmeticException("e -> / by zero");
		}
		return a / b;
	}
}
