package view.inheritance.cclass;

import java.math.BigDecimal;

public class Book {
	//mã sách, tên sách, nhà xuất bản,
	private String bookId;
	private String bookName;
	private BigDecimal salesPrice;
	private String publicsher;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(String bookId, String bookName, BigDecimal salesPrice, String publicsher) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.salesPrice = salesPrice;
		this.publicsher = publicsher;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPublicsher() {
		return publicsher;
	}

	public void setPublicsher(String publicsher) {
		this.publicsher = publicsher;
	}
	
	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}
	
	public BigDecimal getSalesPrice() {
		return salesPrice;
	}
	
	@Override
	public String toString() {
		return bookId + ", " + bookName + ", " + publicsher + ", " + salesPrice;
	}
}
