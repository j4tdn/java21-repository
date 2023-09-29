package view.inheritance.cclass;

import java.math.BigDecimal;

public class ReferenceBook extends Book{

	private BigDecimal tax;
	
	// khi gọi hàm khởi tạo KDL con --> yêu cầu phải gọi đến 1 hàm khởi tạo của KDL cha
	// mặc định gọi super(), nên trong KDL cha nên có 1 hàm khởi tạo rỗng
	
	public ReferenceBook() {
	}

	// super: đại diện cho đối tượng KDL cha --> super.abc thì super là đối tượng
	// super(): gọi đến hàm khởi tạo cha
	// this: đại diện cho đối tượng KDL hiện tại
	
	public ReferenceBook(String id, String name,BigDecimal salesPrice , String publisher, BigDecimal tax) {
		super(id, name,salesPrice , publisher);
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
		return "ReferenceBook [" + super.toString() + "tax=" + tax + "]";
	}
	
}
