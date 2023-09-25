package view.inheritance.cclass;

import java.math.BigDecimal;

//book: id, name, publisher
public class ReferenceBook extends Book {
 
	private BigDecimal tax;
	
	// Khi gọi hàm khởi tạo của KDL con
	// Yêu cầu phải gọi đến 1 hàm khởi tạo của KDL cha
	// Mặc định gọi super(). nên trong KDL cha nên có 1 hàm khởi tạo rỗn
	public ReferenceBook() {
	}
	
	//super: đại diện cho KDL cha
	//super (...): gọi hàm khởi tạo của cha
	
	//this : đại diện cho KDL hiện tại
	//this(...)
	public ReferenceBook(String id, String name, BigDecimal salePrice,  String publisher, BigDecimal tax) {
		super(id, name, salePrice, publisher);
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
		// TODO Auto-generated method stub
		return super.toString() + "," + tax;
	}
}
