package Ex05;

public class TextBook extends Book{
	private String status;

	public TextBook(String string, int i, String string2, String string3) {
	}
	
	
	
	
	public TextBook(int id, double price, String publisher, String status) {
		super(id, price, publisher);
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
		return "TextBook [status=" + status + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
