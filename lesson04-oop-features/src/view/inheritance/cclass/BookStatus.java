package view.inheritance.cclass;

public enum BookStatus {
	// Để truy cập các biến(đối tượng) trong enum --> BookStatus.NEW, BookStatus.OLD,
	// BookStatus[] BookStatus.values() lấy tất cả giá trị
	
	// Mặc định --> name, index(thứ tự trong enum)
	
	//NEW --> BookStatus NEW = new BookStatus("mới");
	//OLD --> BookStatus OLD = new BookStatus("cũ");
	
	
	NEW("mới"), 
	OLD("cũ");
	
	private String value;
	
	BookStatus(String value) {
	}
	
	public String getValue() {
		return value;
	}

}
