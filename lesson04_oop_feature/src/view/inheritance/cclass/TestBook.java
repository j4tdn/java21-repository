package view.inheritance.cclass;

import java.math.BigDecimal;

public class TestBook extends Book {
	private BookStatus BookStatus;
	private Integer discount;
	
	public TestBook() {
		
	}

	public TestBook(String id, String name, BigDecimal salesPrice, String publisher, view.inheritance.cclass.BookStatus bookStatus,
			Integer discount) {
		super(id, name, salesPrice, publisher);
		BookStatus = bookStatus;
		this.discount = discount;
	}

	public BookStatus getBookStatus() {
		return BookStatus;
	}

	public void setBookStatus(BookStatus bookStatus) {
		BookStatus = bookStatus;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {		
		return super.toString() + ", " + BookStatus + ", " + discount + "(%)";
	}
}
