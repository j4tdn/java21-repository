package comon;

public class CustomInteger {
	//Integer: private final int value;
	//CustomInteger ci1 = new CustomInteger(15);
	//System.out.println (ci1);
	
	//Integer i1 = 5;
	//Integer i2 = new Integer (5);
	//CustomInteger ci1 = new CustomInteger(15);
	
	public int value;
	public CustomInteger(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "" + this.value;
}
}