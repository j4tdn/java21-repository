package exercise05;

import java.math.BigDecimal;

public class ReferenceBook extends Book{

	private float tax;
	
	public ReferenceBook() {

	}

	public ReferenceBook(String idBook, double salesPrice, String publisher, float tax) {
		super(idBook, salesPrice, publisher);
		this.tax = tax;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferenceBook [tax=" + tax + "]";
	}
	
	
	
	
}
