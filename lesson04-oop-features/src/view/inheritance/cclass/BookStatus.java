package view.inheritance.cclass;

public enum BookStatus {
	
	//Để truy cập các biến(đối tượng) trong enum --> BookStatus.NEW, BookStatus.OLD
	//											 --> BookStatus[] statuses = BookStatus.values()
	
	// mặc định --> name, index (thứ tự trong enum)
	
	// NEW --> BookStatus New = New BookStatus("mới");
	// OLD --> BookStatus OLD = New BookStatus("cũ");
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
