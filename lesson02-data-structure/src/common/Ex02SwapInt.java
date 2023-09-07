package common;

public class Ex02SwapInt {
	
	public static void main(String[] args) {
		Num i1 = new Num();
		Num i2 = new Num();
		i1.v = 2;
		i2.v =3;
		swap(i1, i2);
		System.out.println(i1);
		System.out.println(i2);
		
	}
	
	public static void swap(Num a, Num b) {
		int c;
		c = a.v;
		a.v = b.v;
		b.v = c;	
	}
}
