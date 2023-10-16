package Ex05;

public class ReferencesBook extends Book{
	private float tax;
	
	public ReferencesBook(String string, int i, String string2, float f) {
	}

	
	
	public ReferencesBook(int id, double price, String publisher, float tax) {
		super(id, price, publisher);
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
		return "ReferencesBook [tax=" + tax + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
}
