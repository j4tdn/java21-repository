package view.inheritance.cclass;

import java.math.BigDecimal;

public class TextBook extends Book {
	
	private BookStatus bookStatus;
	private Integer discount;
	//fixx
	public TextBook(String id, String name, BigDecimal salesPrice, String publisher, BookStatus bookStatus, Integer discount) {
		super(id, name,salesPrice, publisher);
		this.bookStatus = bookStatus;
		this.discount = discount;
	}

	public BookStatus getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(BookStatus bookStatus) {
		this.bookStatus = bookStatus;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", " + bookStatus + ", " + discount + "(%)";
	}
		
	
		
		

}
