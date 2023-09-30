package view.inheritance.multiple.iinterface;

public interface Mother {

	void cooking();

	void playBadminton();
	
	default void coding() {
		System.out.println("Mother --> code database");
	}
	
    // Trừu tượng: Lý thuyết
	// Anonymous function (lamda expression)
	// Stratery pattern
	
	// buổi sau: ktra code push code tại lớp
	// --> Sửa tất cả lesson 02, 03, 04
	// Bài tập lesson 04: deadline trước buổi sau
}
