package view.inheritance.cclass;

public enum BookStatus {
	
	// Để truy cập các biến(đối tượng) trong enum  	--> BookStatus.NEW, BoolStatus.OLD
	//												--> BookStatus[] = BookStatus.values()
	
	// Mặc định --> name, ordinal(thứ tự trong enum, zero based)
	
	// NEW --> BookStatus NEW = new BookStatus("mới");
	// OLD --> BookStatus OLD = new BookStatus("cũ");
	
	NEW("mới"),
	OLD("cũ");
	
	private String value;
	
	BookStatus(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
