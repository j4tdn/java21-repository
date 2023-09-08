package common;

public class CusomInteger02 {
	private int a, b;
	
	public CusomInteger02(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void swap() {
		int temp;
		temp = a;
		a = b;
		b = temp;
	}
	
	public static void main(String[] args) {
		CusomInteger02 obj = new CusomInteger02(1,2);
		System.out.println("a --> " + obj.a);
		System.out.println("a --> " + obj.b);
	
		System.out.println("---SWAP---");
		obj.swap();
		System.out.println("a --> " + obj.a);
		System.out.println("a --> " + obj.b);
	}
}
