package oop;

class ReferenceBook {
	String bookCode;
	double price;
	String publisher;
	double tax;

	public ReferenceBook(String bookCode, double price, String publisher, double tax) {
		this.bookCode = bookCode;
		this.price = price;
		this.publisher = publisher;
		this.tax = tax;
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

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferenceBook [bookCode=" + bookCode + ", price=" + price + ", publisher=" + publisher + ", tax=" + tax
				+ "]";
	}

}