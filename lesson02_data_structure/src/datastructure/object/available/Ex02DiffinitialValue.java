package datastructure.object.available;

public class Ex02DiffinitialValue {
	public static void main(String[] args) {
	    Integer a = 1;
	    Integer b = 2;
	    Integer[] integers = new Integer[]{a, b};
	    swapInteger(integers);
	    a = integers[0];
	    b = integers[1];
	    System.out.println("a --> "+ a);
	    System.out.println("b --> "+ b);
	}

	private static void swapInteger(Integer[] arr) {
	    Integer temp = arr[0];
	    arr[0] = arr[1];
	    arr[1] = temp;
	}

	
}
