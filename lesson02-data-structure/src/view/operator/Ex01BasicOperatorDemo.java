package view.operator;

public class Ex01BasicOperatorDemo {
	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		
		a = a + 1; // a = 3
		a += 1; // a = 4
		System.out.println(a);
		
		// toán tử ++ --
		// tiền tố or hậu tố
		
		int c = a++; // hậu tố, sử dụng giá trị hiện tại cho biểu thức rồi mới tăng/giảm sau.
		int d = ++b; // tiền tố, tăng/giảm giá trị rồi mới thực hiện biểu thức
		
		
		// &&: kết quả trả về False khi tồn tại 1 biểu thức trả về false, các biểu thức còn lại sẽ không đc/cần thực thi
		// ||: kết quả trả về True khi tồn tại 1 biểu thức trả về true, các biểu thức còn lại sẽ không đc/cần thực thi
		boolean testOperator = a++ > 7 && c++ < 5;
		System.out.println(a);
		System.out.println(c);
		System.out.println(testOperator);
		
	}
}
