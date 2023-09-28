package view.inheritance.cclass;

public enum BookStatus {
	// Để truy cập các biến(đối tượng) trong enum --> BookStatus.NEW, BookStatus.OLD
//												  --> BookStatus[] statuses = BookStatus.values()
	
	// Mặc định --> name, index(thứ tự trong enum)
	// NEW --> Bookstatus NEW = new Bookstatus();
	// OLD --> Bookstatus NEW = new BookStatus();
	
	
	
	NEW,OLD;
	
	
	private BookStatus() {
		
	}
}
