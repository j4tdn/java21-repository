package view.functional.iinterface;

@FunctionalInterface
public interface IntComparator {
	
	int compare(int a, int b);
	
	// Để tạo 1 đối tượng cho IntComparator
	//--> dùng External class, anonymous class
	
}
