package view;

import bean.Tuple;

public class Ex03MethodStaticDemo {
	/*
	 * static: không phụ thuộc vào đối tượng đang gọinos
	 * 
	 * + atrribute
	 * --> dùng chung cho các đối tượng
	 * --> lưu trữ,quản lý mà mỗi đối tượng lưu trữ, quản lý riêng một vùng nhớ*/
	// Car: id,model(static)
	
	public static void main(String[] args) {
		int a = 6;
		int b = 7;
//		Ex03MethodStaticDemo ms1 = new Ex03MethodStaticDemo();
//		System.out.println(ms1.sum(a, b));
//		
		
		Tuple tuple1 = new Tuple(3,2);
		System.out.println("tuple1 sum -->"+tuple1.sum());
		
	}
	
		
//	private int sum(int a, int b) {
//		return a + b;
//	}
}
