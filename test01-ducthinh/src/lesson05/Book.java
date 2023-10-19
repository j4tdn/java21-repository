package lesson05;

public class Book {
	private String id;
	protected double cost;
	private String author;
	
	public Book() {
		
	}

	public Book(String id, double cost, String author) {
		super();
		this.id = id;
		this.cost = cost;
		this.author = author;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book id=" + id + ", cost=" + cost + ", author=" + author;
	}
	
	
}
