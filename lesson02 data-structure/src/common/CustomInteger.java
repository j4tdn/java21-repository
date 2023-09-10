package common;

public class CustomInteger {
	// Integer: private final int value
	// CustomInteger ci1 = new CustomInteger(15);
	// System.out.println(ci1);
	
	// Integer ci1 = 5;
	// Integer ci2 = new Integer(5);
	
	// CustomInteger ci1 = 15; // failed
	// CustomInteger ci1 = new CustomInteger(15);
	
	public int value;
	
	public CustomInteger(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
