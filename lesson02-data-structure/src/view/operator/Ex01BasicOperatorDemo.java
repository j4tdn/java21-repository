package view.operator;

public class Ex01BasicOperatorDemo {

	public static void main(String[] args) {
		
		//toán tử gán --> =
		// VT = VP --> nếu VP là 1 biểu thức tính toán thì thực hiện xong VP trước rồi đc KQ xong gán cho VT
		int a = 2;
		int b = 4;
		
		a = a + 1; // a = 3
		a += 1; // a = 4
				
		// System.out.println("a --> "+a);
		
		// toán tử ++ --
		// tiền tố hoặc hậu tố
		
		int c = a++; // hậu tố: sử dụng giá trị hiện tại cho biểu thức rồi mới tăng/giảm ++ -- sau
		int d = ++b; // tiền tố: ++ -- vào giá trị hiện tại rồi mới thực hiện biểu thức
		
		System.out.println("a --> " +a);
		System.out.println("b --> " +b);
		System.out.println("c --> " +c);
		System.out.println("d --> " +d);
		
		int z = a++ + --b + b-- - ++a + d++ + ++d;
		
		System.out.println("\n===========================\n");
		
		System.out.println("a --> " +a);
		System.out.println("b --> " +b);
		System.out.println("d --> " +d);
		System.out.println("z --> " +z);
		
		// toán tử == %
		System.out.println("\n===========================\n");
		
		boolean isAEqualsB = (a == b);
		System.out.println("isAEqualsB --> " + isAEqualsB);
		
		boolean isAGreaterThanB = (a > b);
		System.out.println("isAGreaterThanB --> " + isAGreaterThanB);
		
		boolean isEven = (z % 2 == 0);
		System.out.println("isEven --> " + isEven);
		
		// toán tử && ||
		
		// &&: toán tử AND
		// cú pháp: BT1 && BT2 && BT3 && BTn --> BT(k)(true false)
		// KQ sẽ trả về TRUE khi tất cả các biểu thức đều trả về TRUE 
		// KQ sẽ trả về FALSE khi tồn tại 1 biểu thức trả về FALSE, các biểu thức còn lại sẽ ko đc/ cần thực thi
		
		// ||
		// cú pháp: BT1 || BT2 || BT3 || BTn --> BT(k)(true false)
		// KQ trả về TRUE khi tồn tại 1 biểu thức là TRUE, các biểu thức còn lại sẽ ko đc/ cần thực thi
		// KQ sẽ trả về FALSE khi tất cả các biểu thức đều trả về FALSE
		
		System.out.println("\n===========================\n");
		
		// boolean testAndOperator = a++ > 7 && d++ < 9;
		// boolean testAndOperator = ++a > 7 && d++ < 9;
		boolean testAndOperator = ++a > 7 || d++ > 7;
		System.out.println("a --> " +a);
		System.out.println("d --> " +d);
		System.out.println("testAndOperator --> " +testAndOperator);
	}
}
