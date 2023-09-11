package view.operator;

public class Ex01BasicOperatorDemo {
	public static void main(String[] args) {
		
		//toán tử gán --> =
		//VT = VP --> nếu VP là 1 biểu thức tính toán thì thực hiện xong VP trước rồi được kết quả mới gán cho VT
		int a = 2;
		int b = 4;
		a = a +1 ; // a =3
		a += 1 ;// a =4
		
		System.out.println("a-->"+a);
		
		//toán tử ++ --
		//Tiền tố hoặc hậu tố
		
		int c = a++; // hậu tố: sử dụng giá trị hiện tại cho biểu thức rồi mới tăng/ giảm ++ -- sau
		int d = ++b; // tiền tố: ++ -- vào giá trị hiện tại rồi mới thực hiện biểu thức
		
		System.out.println("a-->" +a); //5
		System.out.println("b-->" +b); //5
		System.out.println("c--" +c); //4
		System.out.println("d-->" +d); //5
		System.out.println("-----------");

		int z = a++ + --b + b-- - ++a + d++ + ++d;
		System.out.println("a-->" +a); // a = 7
		System.out.println("b-->" +b);  // 
		System.out.println("c--" +c); 
		System.out.println("d-->" +d); // 7
		System.out.println("z-->" +z);
		// Toán tử == %
		boolean isAEqualsB = (a ==b);
		System.out.println("isAequalsB -->" +isAEqualsB);
		boolean isAgreaterThanB = (a > b);
		System.out.println("isAequalsB -->" +isAgreaterThanB);
		boolean isEven = (z %2 == 0);
		System.out.println("isEven -->" +isEven);
		
		//Toán tử && || ( hoặc hoặc)
		
		// &&: toán tử AND
		// Cú pháp: bo	lean KQ =  BT1 && BT2 && BT3 &&BT N --> BT(k) (true false)
		// KQ sẽ trả về true khi tất cả các Biểu thức trả về true
		// Sẽ dừng lập tức nếu tồn tại 1 biểu thức false, các biểu thức còn lại sẽ không cần thực thi
		//
		
		//|| 
		// Cú pháp: bolean KQ =  BT1 || BT2 || BT3 ||BT N --> BT(k) (true false)
		// KQ sẽ trả về false khi tất cả các Biểu thức trả về false
		// KQ trả về TRUE khi tồn tại 1 biểu thức trả về là TRUE, các biểu thức sau sẽ không cần / được thực thi
		// 
		System.out.println("-----------");
		//boolean testAndOperator = a++ > 7 && d++ < 9; // a = 7 > 7 sai, sau đó +1 lên a = 8 dừng chương trình k cần chạy tiếp 
		//boolean testAndOperator = ++a > 7 && d++ < 9;
		boolean testAndOperator = ++a > 7 || d++ >7;
		System.out.println("a-->" +a); // 8
		System.out.println("d-->" +d); //7
		System.out.println("testAndOperator-->" +testAndOperator);
	
	}

}
