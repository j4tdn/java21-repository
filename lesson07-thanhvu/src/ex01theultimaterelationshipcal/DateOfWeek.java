package ex01theultimaterelationshipcal;

public enum DateOfWeek {
	SUNDAY("Chủ Nhật"), MONDAY("Thứ Hai"), TUESDAY("Thứ Tư"), 
	WEDNESDAY("Thứ Tư"), THURSDAY("Thứ Năm"), FRIDAY("Thứ Sáu"), 
	SATURDAY("Thứ Bảy");
	
	private String text;
	
	DateOfWeek(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	
	@Override
	public String toString() {
		return text;
	}	
}
