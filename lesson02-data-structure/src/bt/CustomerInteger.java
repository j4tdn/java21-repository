package bt;

public class CustomerInteger {
	private int value;

	public CustomerInteger(int value) {
		super();
		this.value = value;
	}

	public CustomerInteger() {
		super();
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value + "";
	}
	
	public static void swap(CustomerInteger i1, CustomerInteger i2) {
		int temp = i1.value;
		i1.value = i2.value;
		i2.value = temp;
	}
}
