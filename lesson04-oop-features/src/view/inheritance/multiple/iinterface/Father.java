package view.inheritance.multiple.iinterface;

public interface Father {

	void cooking();
	
	void ruuning();
	
	default void coding() {
		//isOdd();
		System.out.println("Father --> code backend");
	}
	
//	default void testing() {
//		isOdd();
//	}
//	
//	default boolean isOdd() {
//		return true;
//	}
	
	
	// Java 8 --> default, static hàm có thể có body
	// Java 9 --> private
}
