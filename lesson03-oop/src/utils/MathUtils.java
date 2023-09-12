package utils;

/*
 * Utility class là class chưa các helper methos
 * 
 * Helps Methos là những phương thức dùng chung cho nhiều chỗ
 * và mình sẽ tạo ra static method strong Utility class
 
 */
public class MathUtils {
	
	private MathUtils() {
		
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
}
