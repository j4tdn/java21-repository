package view.inheritance.cclass;

import java.math.BigDecimal;

public class TextBook extends Book {
	private BookStatus bookStatus;
	private Integer discount;
	
	public TextBook() {
	}
	public TextBook(String bookId, String bookName, String publicsher, BigDecimal salesPrice, BookStatus statusBook, Integer discount) {
		super(bookId, bookName, salesPrice, publicsher);
		this.bookStatus = statusBook;
		this.discount = discount;
	}
	public BookStatus getStatusBook() {
		return bookStatus;
	}
	public void setStatusBook(BookStatus statusBook) {
		this.bookStatus = statusBook;
	}
	public Integer getDiscount() {
		return discount;
	}
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + bookStatus + ", " + discount + "(%)\n";
	}
	
	
	
}
