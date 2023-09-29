package view.inheritance.cclass;

import java.math.BigDecimal;

// Book: id, name, publisher
public class ReferenceBook extends Book{

	private BigDecimal tax;
	
	// Khi gọi hàm khởi tạo của KDL con
	// Yêu cầu phải gọi đến 1 hàm khởi tạo của KDL cha
	// MẶc định gọi super(), nên trong KDL cha nên có 1 hàm khởi tạo rỗng
	
	public ReferenceBook() {
	}
	
	// super: đại diện cho đối tượng KDL cha
	// this: đại diện cho đối tượng KDL hiện tại

	public ReferenceBook(String id, String name, BigDecimal salesPrice, String publisher, BigDecimal tax) {
		super(id, name, salesPrice, publisher);
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
