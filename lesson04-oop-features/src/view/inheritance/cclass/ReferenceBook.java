package view.inheritance.cclass;

import java.math.BigDecimal;

public class ReferenceBook extends Book {
	//mã sách, tên sách, nhà xuất bản
	private BigDecimal bookTax;
	
	// Khi gọi hàm khởi tạo của KDL con
	// Yêu cầu phải gọi đến 1 hàm khởi tạo của KDL cha
	// Mặc định gọi super(), nên trong KDL cha nên có 1 hàm khởi tạo rỗng.
	
	// super: đại diện cho đối tượng KLD cha --> this.
	// super(): đại diện là hàm khởi tạo của cha --> this()
	
	// this: đại diên cho đối tượng KDL class hiện tại --> this.
	// this(): đại diện cho hàm khởi tạo của class hiện tại --> this()
	
	public ReferenceBook() {
	}

	public ReferenceBook(String bookId, String bookName, BigDecimal salesPrice, String publicsher, BigDecimal bookTax) {
		super(bookId, bookName, salesPrice, publicsher);
		this.bookTax = bookTax;
	}

	public BigDecimal getBookTax() {
		return bookTax;
	}

	public void setBookTax(BigDecimal bookTax) {
		this.bookTax = bookTax;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + bookTax + "%\n";
	}
	
	
	
}
