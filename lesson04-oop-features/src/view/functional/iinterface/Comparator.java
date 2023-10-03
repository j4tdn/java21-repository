package view.functional.iinterface;

@FunctionalInterface
public interface Comparator {
	
	int compare(int a, int b);
	
	// Để tạo đối tượng cho Comparator
	// --> dùng extenal class, anonymous class

}
