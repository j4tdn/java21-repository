package view.inheritance.multiple.iinterface;

public interface Father {
	
	void cooking();
	
	void running();
	
	default void coding() {
		System.out.println("Father --> code backend");
	}
	
	// Java8 --> default, static hàm có thể có body
	// Java9 --> private
	
	// interface List
	// add, remove, get, set
	
	// Java8 --> tạo ra thêm 1 số hàm đưa vào interface List
	// removeIf, forEach, addIfAbsent
	
	// implementation classes
	
	// ArrayList
	
	// LinkedList
	
	// Vector
	
	// Stack
	
	// AbstracList
	
	/// 
}
