package view.inheritance.mutiple.iinterface;

public interface Mother {

	void cooking();
	
	void playBadminton();
	default void coding() {
		System.out.println("Father --> Coding");
	}
}
