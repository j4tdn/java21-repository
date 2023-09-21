package view.inheritance.cclass;

public enum BookStatus {
	// Để truy cập các biến (đối tượng) trong enum --> BookStatus.NEW, BookStatus.OLD, 
	//                                             --> BookStatus[] status = BookStatus.value()

	// Mặc định --> name, index(thứ tự trong enum,  zero based)
	
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
	
	//đối với enum, mặc định không khai báo thì là private

	
	
}
