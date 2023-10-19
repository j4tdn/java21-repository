package lesson05;

public class TextBook extends Book {
	private String status;
	
	public TextBook() {
		
	}

	public TextBook(String id, double cost, String author, String status) {
		super(id, cost, author);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return super.toString() + ", " +status;
	}
	
	public double calculateCost() {
		if(status.equalsIgnoreCase("new")) {
			return cost;
		}else {
			return cost * 0.7;
		}
	}
	
}
