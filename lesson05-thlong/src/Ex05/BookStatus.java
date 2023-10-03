package Ex05;

public enum BookStatus {
NEW("mới"), OLD("cũ");
	
	private String value;
	
	private BookStatus(String value) {
		this.value = value;	
	}
	
	public String getValue() {
		return value;
	}
	
}
