package view.inheritance.cclass;

public enum BookStatus {
	
	// Để truy cập các biến(đối tượng) trong enum --> BookStatus.NEW, BookStatus.OLD
	//											  --> BookStatus[] statuses = BookStatus.value()
	
	// Mặc định --> name, index(thứ tự trong enum)

	//  NEW --> BookStatus NEW = new BookStatus("mới");
    //  OLD --> BookStatus OLD = new BookStatus("cũ");
	
	NEW("Mới"),
	OLD("Cũ");
	
	private String value;
	
	 BookStatus(String value) {
		 this.value = value;
	 }
	 
	 public String getValue() {
		 return value;
	 }
	
}
