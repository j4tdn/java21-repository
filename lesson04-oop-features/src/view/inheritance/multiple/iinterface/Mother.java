package view.inheritance.multiple.iinterface;

public interface Mother {
	
	void cooking();
	
	void playBadminton();
	
	default void coding() {
		System.out.println("Mother --> code database");
	}
}
