package view.inheritance.multiple.iinterface;

public interface Father {
	void cooking();
	
	void ruuning();
	
	// Java8 --> default, static hàm có thể có body
	// Java9 --> private
	
	default void coding() {
		System.out.println("Father --> code backend");
	}
}
