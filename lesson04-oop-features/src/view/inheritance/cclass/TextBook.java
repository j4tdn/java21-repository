package view.inheritance.cclass;

import java.math.BigDecimal;

public class TextBook extends Book {

	private Bookstatus bookstatus;
	private BigDecimal discount;

	public TextBook() {

	}

	public TextBook(String id, String name,BigDecimal salesPrice, String publisher, Bookstatus bookstatus, BigDecimal discount) {
		super(id, name,salesPrice, publisher);
		this.bookstatus = bookstatus;
		this.discount = discount;
	}

	public Bookstatus getBookstatus() {
		return bookstatus;
	}

	public void setBookstatus(Bookstatus bookstatus) {
		this.bookstatus = bookstatus;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + bookstatus + ", " + discount + "%";
	}

}
