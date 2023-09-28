package view.inheritance.multiple.iinterface;

public interface Father {

	void cooking();
	
	void running();
	
	default void coding() {
		System.out.println("Father --> code backend");
	}
	//java8 --> default, static hàm có thể có body
	//java9 --> private
	
	
}
