package Ex05;

public class Book {
	private int id;
	private double price;
	private String publisher;
	
	public Book() {
	}
	
	
	
	public Book(int id, double price, String publisher) {
		super();
		this.id = id;
		this.price = price;
		this.publisher = publisher;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", publisher=" + publisher + "]";
	}
	
	
}
