package datastructure.primitive;

class IntegerWrapper {
	Integer value;

	public IntegerWrapper(int value) {
		this.value = value;
	}
}

public class swapint {
	public static void swap(IntWrapper a, IntWrapper b) {
		int c = a.value;
		a.value = b.value;
		b.value = c;
	}

	public static void main(String[] args) {
		IntWrapper a = new IntWrapper(7);
		IntWrapper b = new IntWrapper(10);
		swap(a, b);
		System.out.println(b.value);
	}
}
