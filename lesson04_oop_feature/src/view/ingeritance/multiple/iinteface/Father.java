package view.ingeritance.multiple.iinteface;

public interface Father {
	void cooking();
	void playBadminton();
	
	private boolean isOdd() {
		return true;
	}
	default void coding() {
		System.out.println("Father --> code backend");
	}
}
