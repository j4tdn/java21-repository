package view.inheritance.cclass;

public enum BookStatus {
	
	// Để truy cập các biến(đối tượng) trong enum --> BookStatus.NEW, BookStauts.OLD, BookStatus[] statuses = BookStatus.values()

	// NEW --> BookStatus NEW = new BookStatus();
	// OLD --> BookStatus OLD = new BookStatus();
	
	NEW("mới"), OLD("cũ");
	
	private String value;
	
	BookStatus(String value) {
		this.value = value;
	}
	
}
