package view.inheritance.cclass;

import java.math.BigDecimal;

// Book: id, name, salesPrice, publisher
public class ReferenceBook extends Book {
	
	private BigDecimal tax;
	
	// khi gọi hàm khởi tạo KDL con 
	// Yêu cầu phải gọi đến 1 hàm khởi tạo KDL cha
	// Mặc định gọi super(), nên trong KDL cha nên có 1 hàm khởi tạo rỗng
	
	public ReferenceBook() {
	}
	
	// super: đại diện cho đối tượng KDL cha --> super. --> đối tượng
	// super(...): gọi hàm khởi tạo
	// this : đại diện cho đối tượng KDL hiện tại --> this. --> gọi đối tượng
	// this(...): gọi hàm khởi tạo của 1 class

	public ReferenceBook(String id, String name, BigDecimal salePrices, String publisher, BigDecimal tax) {
		super(id, name, salePrices, publisher);
		this.tax = tax;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + tax;
	}
}
