package utils;

/*
 Utility class là 1 class chứa các helper methods.
 
 Helper methods là những phương thức dùng chung cho nhiều chỗ 
 và mình sẽ tạo ra static method trong Utility class
 */

public class MathUtils {
	// để private mục đích không bao giờ tạo ra đối tượng
	private MathUtils() {
		
	}
	
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
}
