package view.operator;

public class Ex01BasicOperatorDemo {
	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		
		a = a + 1;
		a += 1;
		System.out.println("a: " + a);
		
		int c = a++;	// hậu tố, sử dụng giá trị hiện tại cho biểu thức rồi mới tăng/giảm sau.
		int d = ++b;	// tiền tố, tăng/giảm vào giá trị hiện tại trước rồi mới thực hiện biểu thức.
		
		
		
	}
}
