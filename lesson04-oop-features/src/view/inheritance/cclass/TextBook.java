package view.inheritance.cclass;

import java.math.BigDecimal;

public class TextBook extends Book{
	private Integer discount;
	private BookStatus bookState;
	
	public TextBook() {

	}

	public TextBook(String id, String name, BigDecimal salesPrice, String publisher, BookStatus bookState, Integer discount ) {
		super(id, name, salesPrice, publisher);
		this.bookState = bookState;
		this.discount = discount;
		
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public BookStatus getBookState() {
		return bookState;
	}

	public void setState(BookStatus bookState) {
		this.bookState = bookState;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + bookState + ", " + discount + "(%)"; 
	}
	
	
}
