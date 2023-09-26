package view.inheritance.cclass;

import java.math.BigDecimal;

public class ReferennceBook extends Book {
	
	private BigDecimal tax;
	
	// Khi gọi hàm khởi tạo của KDL con
	// Yêu cầu phải gọi đến 1 hàm khởi tạo của KDL cha
	// Mặc định gọi super(), nên trong KDL cha nên có 1 hàm khởi tạo rỗng	
	public ReferennceBook() {

	}

	// super: đại diện cho đối tượng KDL cha
	// this: đại diện cho đối tượng KDL hiện tại
		
	public ReferennceBook(String id, String name, BigDecimal salesPrice, String publisher, BigDecimal tax) {
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
