package view.polymorphism.method;

public class Ex02OverrideDemo {
	public static void main(String[] args) {
		
		PolyChild pc = new PolyChild();
		pc.log();
		pc.test();
		
		// Tại sao mình không code 2 hàm log riêng biệt tại PolyParent và Poly Child
		// Mà phải tạo log ở parent xong override ở child
		
		/*
		 1. Tạo thằng cha, có code chung khi đó thằng con kế thừa
		 2. giúp code sạch sẽ, đồng nhất dùng chung hàm (override ahfm thui)
		 */
	}
}
