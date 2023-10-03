package exercise05;


/*
 * ▪ Sách giáo khoa: Mã sách, đơn giá, nhà xuất bản, tình trạng (mới, cũ).
▪ Sách tham khảo: Mã sách, đơn giá, nhà xuất bản, thuế %. 
Biết rằng:

- Sách giáo khoa sẽ có mã sách bắt đầu là SGK
- Sách tham khảo sẽ có mã sách bắt đầu là STK
 */

public class Book {
	
	private String idBook;
	private double salesPrice;
	private String publisher;
	
	
	public Book() {

	}


	public Book(String idBook, double salesPrice, String publisher) {
		this.idBook = idBook;
		this.salesPrice = salesPrice;
		this.publisher = publisher;
	}


	public String getIdBook() {
		return idBook;
	}


	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}


	public double getSalesPrice() {
		return salesPrice;
	}


	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	@Override
	public String toString() {
		return "Book [idBook=" + idBook + ", salesPrice=" + salesPrice + ", publisher=" + publisher + "]";
	}
	
	
	
	
}
