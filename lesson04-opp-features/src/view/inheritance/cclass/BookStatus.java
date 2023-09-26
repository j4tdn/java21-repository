package view.inheritance.cclass;

public enum BookStatus {
	
	// Để truy cập các biến(đối tượng) trong enum --> BookStatus.NEW, BookStatus.OLD
	//											  --> BookStatus[] statuses = BookStaus.values();
	
	// Mặc đính --> name, index(thứ tự trong enum)
	
	// NEW --> BookStatus NEW = new BookStatus();
	// OLD --> BookStatus NEW = new BookStatus();
	
	
	
	NEW("mới"), OLD("cũ");
	
	private String value;
	
	private BookStatus(String value) {
		this.value = value;	
	}
	
	public String getValue() {
		return value;
	}
	
}
