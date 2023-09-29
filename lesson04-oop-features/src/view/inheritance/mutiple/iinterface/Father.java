package view.inheritance.mutiple.iinterface;

public interface Father {
 void cooking();
 
 void running();
 // java 8 --> default, static hàm có thể có body
 // Có thể kế thừa implement từ nhiều interface Cha, nên có tính chất gần giống như đa kế thừa
 default void coding() {
		System.out.println("Father --> Coding");
	}
}
