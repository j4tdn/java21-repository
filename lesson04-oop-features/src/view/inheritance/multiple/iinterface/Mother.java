package view.inheritance.multiple.iinterface;

public interface Mother {
	void playBadminton();
	void cooking();
	void running();
	default void coding() {
		System.out.println("Mother --> code database");
	}
}
