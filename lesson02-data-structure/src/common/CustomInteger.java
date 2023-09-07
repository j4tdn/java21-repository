package common;

public class CustomInteger {
	//Integer private final int value;
	public int it;
	
	public CustomInteger(int it){
		this.it = it;
	}
	@Override
	public String toString() {
		return "" + this.it;
	}
}
