package view.ingeritance.multiple.iinteface;

public interface Mother {
	void cooking();
	void running();
	default void coding() {
		System.out.println("Mother --> code database");
	}
}
