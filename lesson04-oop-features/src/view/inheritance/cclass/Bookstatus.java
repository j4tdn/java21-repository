package view.inheritance.cclass;

public enum Bookstatus {
	
	//Để truy cập các biến (dối tượng) trong enum --> BookStatus,NEW, Booktatus, OLD
	//											  --> Bookstatus[] statuses = Bookstatus.values()
	
	//Mặc định --> name , index(thứ tự trong enum)
	
	// NEW --> BookStatus NEW = new BookStatus("mới");
	// OLD --> BookStatus OLD = new BookStatus("cũ");
	NEW("mới"), OLD("cũ");
	
	private String value;
	Bookstatus(String value){
		this.value=value;
	}
	
}
