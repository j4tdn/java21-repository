package view.inheritance.abstractclass.anonymousefucntion;

@FunctionalInterface
// Tùy ý(arbitrary) đặt tên interface
public interface Strategy {
	// strategy method
	// Tùy ý đặt hàm trừu tượng
	
	// Quan trọng: danh sách các tham số truyền vào và kiểu trả ra
	int process(int a, int b);
}
