package lesson05;

public class ReferBook extends Book {
	private double tax;
	
	public ReferBook() {
		
	}

	public ReferBook(String id, double cost, String author, double tax) {
		super(id, cost, author);
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + tax;
	}

	public double calculateCost() {
		return cost * (1-tax/100);
	}
	

	
	
	
}
