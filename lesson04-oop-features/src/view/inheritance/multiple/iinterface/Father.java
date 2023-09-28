package view.inheritance.multiple.iinterface;

public interface Father {

	void cooking();
	
	void running();
	
	default void coding() {
		System.out.println("Father --> code backend");
	}
	
	
	// Java8 --> default, static hàm có thể có body
	// Java9 --> private
}
