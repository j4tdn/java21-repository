package view.operator;

public class Ex01BasicOperatorDemo {

	public static void main(String[] args) {
		
		// toán tử gán --> =
		// VT =VP nếu VP  là 1 biểu thức tính toán thì thực hiện xong VP trước rồi được KQ gán cho VT
		int a = 2;
		int b = 4;
		
		a = a + 1; // a = 3
		a += 1; // a =  4
		
		//System.out.println("a --> " + a);
		
		// toán tử ++ --
		// tiền tố hoặc hậu tố
		
		int c = a++; // hậu tố, sử dụng giá trị hiện tại cho biểu thức rồi mới tăng giảm --/++ sau
		int d = ++b; // tiền t, ++ -- vào giá trị hiện tại rồi mới thực hiên biểu thức
		
		System.out.println("a --> " + a); // 5
		System.out.println("b --> " + b); // 5
		System.out.println("c --> " + c); // 4
		System.out.println("d --> " + d); // 5
		
		int z = a++ + --b + b-- - ++a + d++ + ++d;
		
		System.out.println("a --> " + a); // 7
		System.out.println("b --> " + b); // 3
		System.out.println("d --> " + d); // 7
		System.out.println("z --> " + z); // 18
		
		// Toán tử == %
		System.out.println("\n=======\n");
		
		
		boolean isAEqualsB = (a == b);
		System.out.println("isAEqualsB -->" + isAEqualsB);
		
		
		boolean isAGreaterThanB = (a > b);
		System.out.println("isAGreaterThanB --> " + isAGreaterThanB);
		
		boolean isEven = (z % 2 == 0);
		System.out.println("isEven -->" + isEven);
		
		// Toán tử && ||
		
		// &&: Toán tử AND
		// Cú pháp: boolean KQ  = BT1 && BT2 && BT3 && BTN --> BT(k) (true false)
		// KQ sẽ trả về TRUE khi tất cả các biểu thức đều trả về TRUE
		// KQ sẽ trả về FALSE khi tồn tại 1 biểu thức trả về FALSE, các biểu thức còn lại sẽ ko được/cần thực thi
		
		// ||
		// Cú pháp: boolean KQ  = BT1 || BT2 || BT3 || BTN --> BT(k) (true false)
		// KQ sẽ trả về FALSE khi tất cả các biểu thức đều trả về FALSE
		// KQ sẽ trả về TRUE khi tồn tại 1 biểu thức là TRUE , các biểu thức còn lại sẽ không được/càn thực thi
		
		System.out.println("\n======\n");
		
		//boolean testAndOperator = (a++ > 7 && d++ < 9);
		//boolean testAndOperator = (++a > 7 && d++ < 9);
		boolean testAndOperator = (++a > 7 || d ++ > 7);
		System.out.println("a --> " + a);//8
		System.out.println("d --> " + d);//7
		System.out.println("testAndOperator --> " + testAndOperator);// true
	}

}
