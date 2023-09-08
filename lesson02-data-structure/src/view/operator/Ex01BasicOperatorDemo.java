package view.operator;

public class Ex01BasicOperatorDemo {
	
	public static void main(String[] args) {
		
		// toán tử gán --> = 
		int a = 2;
		int b = 4;
		
		a = a + 1;
		a += 1;
		System.out.println("a ==> " + a);	
		
		
		//toán tử ++ --
		//tiền tố hoặc hậu tố 
		int c = a++; //sử dụng giá trị hiện tại cho biểu thức rồi mới tăng/giảm
		System.out.println("c ==> " + c);	// tiền tố, ++ -- vào giá trị hiện tại rồi mới thực hiện 
		int d = ++b;
		System.out.println("d ==> " + d);
		System.out.println("---------------------------");
		
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		System.out.println("c --> " + c);
		System.out.println("d --> " + d);
		
		
		int z = a++ + --b + b-- - ++a + d++ + ++d;
		
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		System.out.println("d --> " + d);
		System.out.println("z --> " + z);
		
		System.out.println("---------------------------");
		
		boolean isEqualsB = (a == b);
		System.out.println("isEqualsB --> " + isEqualsB);
		boolean isGreaterThanB = (a > b);
		System.out.println("isGreaterThanB --> " + isGreaterThanB);
		
		
		//Toán tử && ||
		
		// &&: Toán tử AND 
		// Cú pháp: Biểu thức 1 && Biểu thức 2 && Biểu thức n --> Biểu thức thứ k  (true false)
		// KQ sẽ trả về TRUE khi tất cả các biểu thức đều trả về TRUE
		// Sẽ dừng ngay lập tức nếu tồn tại 1 biểu thức là false
		
		// ||
		// Cú pháp: boolean KQ = BT1 || BT2 || BTN --> BT(k) (true false)
		// KQ sẽ trả về FALSE khi tất cả các biểu thức đều trả về FALSE
		// KQ sẽ trả về TRUE khi tồn tại 1 biểu thức là TRUE, các biểu thức còn lại sẽ không được/cần thực thi
		
		System.out.println("\n===================\n");
//		boolean testAndOperator = (a++ > 7 && d++ < 9);
//		boolean testAndOperator = (++a > 7 && d++ < 9);
		boolean testAndOperator = (++a > 7 || d++ > 7);
		System.out.println("a --> " + a);  
		System.out.println("d --> " + d);  
		System.out.println("TestAndOperator  --> " + testAndOperator);
		
		
	}
}
