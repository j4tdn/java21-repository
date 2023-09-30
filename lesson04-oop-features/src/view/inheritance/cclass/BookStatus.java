package view.inheritance.cclass;

public enum BookStatus {
	
	// De truy cap cac bien(doi tuong) trong enum --> BookStatus.NEW; BookStatus.OLD;
	//                                                BookStatus[] statuses = BookStatus.values();
	
	// Mac dinh --> name, ordinal(thu tu trong enum, zero based)
	
	// NEW --> BookStaus NEW = new BookSatus("moi");
	// OLD --> BookStaus OLD = new BookSatus("cu");
	
	NEW("mới"), OLD("cũ"); 
	
	
	private String value;
	BookStatus(String value){
		this.value = value;
		
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
	 
	
	
	
	

}
