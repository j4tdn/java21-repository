package view.operator;

public class Ex01BasicOperatorDemo {
	
	public static void main(String[] args) {
		
		// toán tử gán --> = ...
		// VT = VP --> nếu VP là 1 biểu thức tính toán thì thực hiện xong VP trước rồi được kết quả gán cho VT
		
		int a = 2;
		int b = 4;
		
		a = a + 1; // a = 3
		a += 1; // a = 4
		
		// System.out.println("a --> " + a);
		
		// toán tử ++ --
		// tiền tố hoặc hậu tố
		
		int c = a++; // hậu tố, sử dụng giá trị hiện tại cho biểu thức rồi mới tăng/giảm sau
		int d = ++b; // tiền tố, ++ -- vào giá trị hiện tại rồi mới thực hiện biểu thức
		
		System.out.println("a --> " +a); // 5
		System.out.println("b --> " +b); // 5
		System.out.println("c --> " +c); // 4
		System.out.println("d --> " +d); // 5
		
		int z  = a++ + --b + b-- + ++a + d++ + ++d; 
		
		System.out.println("a --> " +a); // 7
		System.out.println("b --> " +b); // 3
		System.out.println("d --> " +d); // 7
		System.out.println("z --> " +z); // 18
		
		System.out.println("=================");
		// toán tử == %
		
		boolean isAEqualsB = (a == b); // a có bằng b không
		System.out.println("isAEqualsB --> " + isAEqualsB);
		
		boolean isAGreaterThanB = (a > b); // a lớn hơn b không
		System.out.println("isAGreaterThanB --> " + isAGreaterThanB);
		
		boolean isEven = (z % 2 == 0); // z có phải số chẵn không
		System.out.println("isEven " + isEven);
		
		// toán tử && ||
		// && toán tử AND
		// cú pháp: BT1 && BT2 && BT3 && BTN --> BT(k)(true false)
		// KQ sẽ trả về TRUE khi kết quả tất cả biểu thức đều là TRUE
		// KQ sẽ trả về FALSE khi tồn tại 1 biểu thức trả về FALSE, các biểu thức còn lại sẽ không được thực thi	
		
		// ||
		// cú pháp: BT1 || BT2 || BT3 || BTN --> BT(k)(true false)
		// KQ sẽ trả về FALSE khi kết quả tất cả biểu thức đều là FALSE
		// KQ sẽ trả về TRUE khi tồn tại 1 biểu thức trả về TRUE, các biểu thức còn lại sẽ không được thực thi
		
		System.out.println("=================");
		// boolean testAndOperator = a++ > 7 && d++ < 9;
		boolean testAndOperator = ++a > 7 && d++ < 9;
		System.out.println("a --> " +a); // 
		System.out.println("d --> " +d); // 
		System.out.println("testAndOperator --> " + testAndOperator); // false
		
		 
	
	}

}
