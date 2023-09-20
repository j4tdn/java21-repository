package view.inheritance.cclass;

public enum BookStatus {
	// để truy cập các biến( đối tượng) trong enum --> BookStatus.NEW
	// NEW --> BookStatus NEW = new BookStatus();
	//--> BookStatus[] statuses = BookStatus.values();
	NEW("mới"), OLD("cũ");
	private String value;
	BookStatus( String value){
		this.value = value;
	}
	public String getValue() {
		return value;
	}
	
	
}
