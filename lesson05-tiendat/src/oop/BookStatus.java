package oop;

public enum BookStatus {
	NEW("mới"), 
	OLD("cũ");

	private String value;

	BookStatus(String value) {
		this.value = value;

	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
