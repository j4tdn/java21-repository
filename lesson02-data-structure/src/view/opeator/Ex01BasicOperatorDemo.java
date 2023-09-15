package view.opeator;

public class Ex01BasicOperatorDemo {
	public static void main(String[] args) {
		
		// Toán tử gán
		int a = 2;
		int b = 4;
		
		a = a + 1; // a = 3
		a += 1; // a = 4
		
		int c = a++;
		int d = ++b;
		
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		System.out.println("c --> " + c);
		System.out.println("d --> " + d);
		
		int z = a++ + --b + b-- - ++a + d++ + ++d;
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		System.out.println("c --> " + c);
		System.out.println("d --> " + d);
		System.out.println("z --> " + z);

		// Toán tử && 
		// + kq trả về true khi tất cả true
		// + kq trả về false khi 1 biểu thức false, VÀ CÁC BIỂU THỨC CÒN LẠI K ĐC THỰC THI
		
		
		// Toán tử ||
		// + kq true khi 1 true, CÁC BIỂU THỨC CÒN LẠI K CẦN THỰC THI
		// + kq false khi tất cả false
	}
}
