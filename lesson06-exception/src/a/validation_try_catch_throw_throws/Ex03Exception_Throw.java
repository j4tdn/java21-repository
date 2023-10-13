package a.validation_try_catch_throw_throws;

public class Ex03Exception_Throw {
	
	//validation: validation trước đoạn code có khả năng bị exception
	//try catch: đưa đoan code có khả năng bị exception vào khối try
	
	//throw_throws
	//throw: ném exception trước khi đoạn code có khả năng bị exception 
	//		: ném khi mà exception xảy ra hay k phụ thuộc vào param truyền lúc gọi hàm
	
	//compile, runtime exception
	//trong hàm: nếu mình throw new runtime exception(RE)
	//			 thì tại chỗ khai báo hàm kh bắt buộc phải throws ra RE
	//			 và nếu mình có throws RE thì nó vô nghĩa (RE kh bắt buộc phải xử lý tại compile)
	//trong hàm: nếu mình throw new compile exception(CE)
	//			 thì tại chỗ khai báo hàm bắt buộc phải throws ra CE
	//			 để chỗ gọi hàm biết đc bên trong hàm có CE --> bắt buộc phải xử lý tại compile
	
	public static void main(String[] args) {
		// vị trí A: gọi hàm divide
		//		   : validate a, b nhập vào phải là số nguyên
		//		   :             b phải khác 0
		System.out.println("Vị trí A: " + divide(4, 2));
		
		
		// Vị trí B: gọi hàm divide
		//		   : cho a, b tùy ý - chưa có validation
		
		try {
			System.out.println("Vị trí B: " + divide(4, 0));
		} catch (RuntimeException e) {
			System.out.println("ef -> " + e.getMessage());
		}
	}
	
	private static int divide(int a, int b) {
		if (b == 0) {
			//fail first
			//custom exception, message
			throw new ArithmeticException("e -> by zero");
		}
		return a/b;
	}
	
}
