package view.operator;

public class Ex01BasicOperatorDemo {
	public static void main(String[] args) {
		
		//toán tử gán --> =
		//VT = VP --> nếu VP là 1 biểu thức tính toán thì thực hiện xong VP trước, r gán kết quả cho VT
		int a = 2;
		int b = 4;
		
		a = a + 1;
		a += 1;
		
		System.out.println("a --> " + a);
		
		// toán tử ++ --
		// tiền tố hoặc hậu tố
		
		int c = a++; // hậu tố, sử dụng giá trị hiện tại cho biểu thức r mới tăng hay giảm sau
		int d = ++b; // tiền tố, ++ -- vào giá trị hiện tại r mới thực hiện biểu thức 
		
		
		System.out.println("\na --> " + a);
		System.out.println("b --> " + b);
		System.out.println("c --> " + c);
		System.out.println("d --> " + d);
		
		int z = a++ + --b + b-- - ++a + d++ + ++d;
		
		System.out.println("===========");
		
		//a 5 6 7
		//b 5 4 3
		//d 5 6 7
		//z 5 + 4 + 4 - 7 + 5 + 7 = 18
		
		System.out.println("\na --> " + a);
		System.out.println("b --> " + b);
		System.out.println("d --> " + d);
		System.out.println("z --> " + z);
		
		//toán tử = %
		System.out.println("===========");
		
		boolean isAEqualsB = (a == b);
		System.out.println("isAEqualsB -->" + isAEqualsB);
		
		boolean isAGreaterThanB = (a>b);
		System.out.println("isAGreterThanB -->" + isAGreaterThanB);
		
		boolean isEven = (z % 2 == 0);
		System.out.println("isEven -->" + isEven);
		
		//tóan tử && ||
		
		//&&: toán tử AND
		//cú pháp : BT1 && BT2 && BT3 && BTn --> Biểu Thức(k) (true false)
		// kết quả sẽ trả về TRUE khi tất cả các biểu thức đều trả về TRUE
		// kết quả sẽ trả về FALSE khi tồn tại 1 biểu thức trả về FALSE, các biểu thức còn lại sẽ k dc thực thi
		
		// ||
		//cú pháp : boolean KQ = BT1 || BT2 || BT3 || BTn --> BT(k) (true false)
		//kết quả sẽ trả về FALSE khi tất cả các biểu thức đều trả về FALSE
		// kết quả sẽ trả về TRUE khi tồn tại 1 biểu thức là TRUE, các biểu thức còn lại sẽ k dc thực thi
		
		System.out.println("===========");
		
		//boolean testAndOperator = (a++ > 7 && d++ < 9);
		//boolean testAndOperator = (++a > 7 && d++ < 9);
		boolean testAndOperator = (++a > 7 || d++ > 9);
		System.out.println("a -->" + a);//8
		System.out.println("d -->" + d);//7
		System.out.println("testAndOperator -->" + testAndOperator);//true
		
	}

}
