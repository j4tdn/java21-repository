package view.inheritance.cclass;

public enum BookStatus {
	// Để truy cập các biến (đối tượng) trong enum --> BookStatus.NEW, BookStatus.OLD, 
	//                                             --> BookStatus [] statues = BookStatus.values();
	// Mặc định --> name, ordinal (thứ tự trong enum, zero base)
	//NEW --BookStatus NEW = new BookStatus("Mới");
	//OLD --BookStatus OLD = old BookStatus("Cũ");
 NEW("mới"),
 OLD("cũ");
	private String value;
	BookStatus(String value) {
		this.value= value;
	}
	public String getValue() {
		return value;
	}
}
