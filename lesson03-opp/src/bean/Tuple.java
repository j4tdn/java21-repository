package bean;

public class Tuple {
	private int a;
	private int b;
	public Tuple() {
		// TODO Auto-generated constructor stub
	}
	public Tuple(int a, int b) {
	
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int sum() {
		return a + b;
	}
	@Override
	public String toString() {
		return "Tuple [a=" + a + ", b=" + b + "]";
	}
	
	
}