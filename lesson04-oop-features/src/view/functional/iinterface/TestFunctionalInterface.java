package view.functional.iinterface;

public class TestFunctionalInterface {
	
	public static void main(String[] args) {
		// Tạo đối tượng cho interface InComparator
		// Cách 1: External class
		// Cách 2: Anonymous class
		// Cách 3: Anonymous function(từ JAVA 8 trở đi)
		Incomparator ic2 = (a, b) -> a + b;
		
		System.out.println("InCompare" + ic2.compare(5, 7));
	}
}
