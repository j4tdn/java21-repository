package oop;

public class TextBook {
	String bookCode;
	double price;
	String publisher;
	BookStatus bookStatus;

	public TextBook(String bookCode, double price, String publisher, BookStatus bookStatus) {
		this.bookCode = bookCode;
		this.price = price;
		this.publisher = publisher;
		this.bookStatus = bookStatus;
	}

	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public BookStatus getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(BookStatus bookStatus) {
		this.bookStatus = bookStatus;
	}

	@Override
	public String toString() {
		return "TextBook [bookCode=" + bookCode + ", price=" + price + ", publisher=" + publisher + ", bookStatus="
				+ bookStatus + "]";
	}

}
