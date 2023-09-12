package view.operator;

public class Ex01BasicOperatorDemo {
	public static void main(String[] args) {
		
		// toán tử gán
		// VT = VP --> nếu VP là 1 biểu thức tính toán thực hiện VP trước rồi được KQ gán cho VT
		int a = 2;
		int b= 4;
		
		a = a + 1; // a = 3
		a += 1; // 4
		
		// toán tử ++
		// tiền tố hoặc hậu tố
		
		int c = a++; // hậu tố sử dụng giá trị hiện tại cho biểu thức rồi mới tăng/giảm ++ -- sau
		int d = ++b; // tiền tố, ++ -- vào giá trị hiện tại rồi mới thực hiện biểu thức
		
		System.out.println(a); //5
		System.out.println(b); //5
		System.out.println(c); //4
		System.out.println(d); //5
		
		int z = a++ + --b + b++ - ++a + d++ + ++d;
		
		// Toán tử AND: FALSE --> dừng
		// Toán tử OR: True --> dừng
		
	}
}
