package exercise05;

public class SchoolBook extends Book{
	
	private boolean status;
	
	public SchoolBook() {

	}

	public SchoolBook(String idBook, double salesPrice, String publisher, boolean status) {
		super(idBook, salesPrice, publisher);
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "SchoolBook [status=" + status + "]";
	}
	
	
	
}
