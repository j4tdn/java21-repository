package view.inheritance.cclass;

import java.math.BigDecimal;

public class ReferenceBook extends Book {

	private BigDecimal tax;

	// Khi minh goi ham khoi tao cua KDL con
	// --> Yeu cau goi den 1 ham khoi tao cua KDL cha
	// Mac dinh goi super(), nen trong KDL cha nen co 1 ham khoi tao rong

	public ReferenceBook() {
	}

	// super: dai dien cho doi tuong KDL cha --> super.
	//super(...) : goi ham khoi tao cua cha
	
	// this : -------------------------- hien tai --> this.
	//this(...) :

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
		return super.toString() + "," + tax;
	}

}
